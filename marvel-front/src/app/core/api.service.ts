import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import {Observable} from "rxjs";
import {ApiResponse} from "../model/api-response";


@Injectable()
export class ApiService {

  constructor(private http: HttpClient) { }

  baseUrl: string = 'http://localhost:8080/';

   saveHero(saveHeroLoad) : Observable<ApiResponse> {
   return this.http.post<ApiResponse>(this.baseUrl+'heroes', saveHeroLoad);
  }


  getHeroes() : Observable<ApiResponse> {
    return this.http.get<ApiResponse>(this.baseUrl+'heroes');
   }


   getTeams() : Observable<ApiResponse> {
    return this.http.get<ApiResponse>(this.baseUrl+'teams');
   }



   updateHero(saveHeroLoad) : Observable<ApiResponse> {
    return this.http.put<ApiResponse>(this.baseUrl+'heroes/'+saveHeroLoad.id, saveHeroLoad);
   }
  



   getHeroLinkedComic(rechercheHeroLinkedComic) : Observable<ApiResponse> {
    return this.http.post<ApiResponse>(this.baseUrl+'comicsHeroLink/getComicHeroLinkWithSearch', rechercheHeroLinkedComic);
   }

   
  



}