import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import {Observable} from "rxjs";
import {ApiResponse} from "../model/api-response";


@Injectable()
export class ApiService {

  constructor(private http: HttpClient) { }

  baseUrl: string = 'http://localhost:8080/';

   login(loginPayload) : Observable<ApiResponse> {
   return this.http.post<ApiResponse>('https://localhost:8443' + '/api/auth/login', loginPayload);
  }


  getHeroes() : Observable<ApiResponse> {
    return this.http.get<ApiResponse>(this.baseUrl+'heroes');
   }


   getTeams() : Observable<ApiResponse> {
    return this.http.get<ApiResponse>(this.baseUrl+'teams');
   }

  
  


 


}