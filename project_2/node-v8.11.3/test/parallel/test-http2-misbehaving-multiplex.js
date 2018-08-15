'use strict';

const common = require('../common');

if (!common.hasCrypto)
  common.skip('missing crypto');

const h2 = require('http2');
const net = require('net');
const h2test = require('../common/http2');
let client;

const server = h2.createServer();
server.on('stream', common.mustCall((stream) => {
  stream.respond();
  stream.end('ok');
}, 2));
server.on('session', common.mustCall((session) => {
  session.on('error', common.expectsError({
    code: 'ERR_HTTP2_ERROR',
    type: Error,
    message: 'Stream was already closed or invalid'
  }));
}));

const settings = new h2test.SettingsFrame();
const settingsAck = new h2test.SettingsFrame(true);
const head1 = new h2test.HeadersFrame(1, h2test.kFakeRequestHeaders, 0, true);
const head2 = new h2test.HeadersFrame(3, h2test.kFakeRequestHeaders, 0, true);
const head3 = new h2test.HeadersFrame(1, h2test.kFakeRequestHeaders, 0, true);
const head4 = new h2test.HeadersFrame(5, h2test.kFakeRequestHeaders, 0, true);

server.listen(0, () => {
  client = net.connect(server.address().port, () => {
    client.write(h2test.kClientMagic, () => {
      client.write(settings.data, () => {
        client.write(settingsAck.data);
        // This will make it ok.
        client.write(head1.data, () => {
          // This will make it ok.
          client.write(head2.data, () => {
            // This will cause an error to occur because the client is
            // attempting to reuse an already closed stream. This must
            // cause the server session to be torn down.
            client.write(head3.data, () => {
              // This won't ever make it to the server
              client.write(head4.data);
            });
          });
        });
      });
    });
  });

  // An error may or may not be emitted on the client side, we don't care
  // either way if it is, but we don't want to die if it is.
  client.on('error', () => {});
  client.on('close', common.mustCall(() => server.close()));
});
