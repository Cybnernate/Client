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
    let x = this.http.get("http://localhost:8080/project2BackEnd/MasterServlet");
    return x;

  }
}
