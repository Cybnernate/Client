import { Component } from '@angular/core';
import { Appser, AppService} from './app.service';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  appser: Appser;
  constructor(private appService: AppService) {}
  getTests() {
    return this.appService.getTestResults().subscribe((data: Appser) => this.appser = {
        backEndUrl: data['backEndUrl']
    });
  }
}
