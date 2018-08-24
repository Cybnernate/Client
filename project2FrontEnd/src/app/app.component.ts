import { Component } from '@angular/core';
import { Appser, AppService} from './app.service';
//import { saveAs } from 'file-saver/FileSaver';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private appService: AppService) {}
  getTests() {
    let info = "";
    let respText =  this.appService.getTestResults().subscribe( data => {
      console.log(data);
      info = data;
    });
    document.getElementById("insert").innerHTML = info;
  }
}
