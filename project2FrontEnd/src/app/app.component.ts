import { Component } from '@angular/core';
import { Appser, AppService} from './app.service';
//import { saveAs } from 'file-saver/FileSaver';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  appser: Appser;
  theData: any[] = [];
  constructor(private appService: AppService) {}
  getTests() {
    let respText =  this.appService.getTestResults().subscribe((resp: any) => {
      this.theData = res.data;
    });
    //let theFile = new File([this.respHtml], "tests.json", {type: "text/plain;charset=utf-8"});
    //saveAs(theFile);
    document.getElementById("insertTestHere").innerHTML = "{{theData | json}}";
  }
}
