import { Component } from '@angular/core';
import { Appser, AppService} from './app.service';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  appser: Appser;
  respHtml: string;
  constructor(private appService: AppService) {}
  getTests() {
    let respText =  this.appService.getTestResults().subscribe(data => {this.respHtml = data});
    respText =  this.appService.getTestResults().subscribe(data => {this.respHtml = data});
    document.getElementById("insertTestHere").innerHTML = this.respHtml;
  }
}
