import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export interface Appser {
  backEndUrl: string;
}
@Injectable({
  providedIn: 'root',
})

export class AppService {
  constructor(private http: HttpClient) { }
  getTestResults() {
    let x = this.http.get("http://ec2-54-208-180-126.compute-1.amazonaws.com:8080/project2BackEnd/MasterServlet", {responseType: text'});
    return x;

  }
}
