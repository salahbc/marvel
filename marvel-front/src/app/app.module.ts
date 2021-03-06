import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ShowHeroComponent } from './show-hero/show-hero.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';




import { MatTableModule } from '@angular/material/table';
import { MatSortModule } from '@angular/material/sort';
import { MatPaginatorModule } from '@angular/material/paginator';
import {ApiService} from "./core/api.service";
import {HTTP_INTERCEPTORS, HttpClientModule} from "@angular/common/http";
import {ReactiveFormsModule} from "@angular/forms";
import {TokenInterceptor} from "./core/interceptor";

import { FormsModule } from '@angular/forms';

import { MatIconModule } from '@angular/material/icon';

import { DateAdapter, MAT_DATE_FORMATS, MAT_DATE_LOCALE } from '@angular/material';
import {  MomentDateAdapter } from '@angular/material-moment-adapter';



import { AngularMaterialModule } from "./shared/angular-material.module";
import { AddCharacterComponent } from './add-character/add-character.component';
import { AddSuperTeamComponent } from './add-super-team/add-super-team.component';
import { ComicLinkHeroComponent } from './comic-link-hero/comic-link-hero.component';


import { MatFileUploadModule } from 'angular-material-fileupload';



//create our cost var with the information about the format that we want
export const MY_FORMATS = {
  parse: {
    dateInput: 'DD/MM/YYYY',
  },
  display: {
    dateInput: 'DD/MM/YYYY',
    monthYearLabel: 'MM YYYY',
    dateA11yLabel: 'DD/MM/YYYY',
    monthYearA11yLabel: 'MM YYYY',
  },
};







@NgModule({
  declarations: [
    AppComponent,
    ShowHeroComponent,
    AddCharacterComponent,
    AddSuperTeamComponent,
    ComicLinkHeroComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatTableModule,
    MatSortModule,
    MatPaginatorModule,
    FormsModule,
    MatIconModule,
    AngularMaterialModule,
    MatFileUploadModule
  ],
  providers: [ApiService, {provide: HTTP_INTERCEPTORS,
    useClass: TokenInterceptor,
    multi : true},
    { provide: DateAdapter, useClass: MomentDateAdapter, deps: [MAT_DATE_LOCALE] },
    { provide: MAT_DATE_FORMATS, useValue: MY_FORMATS }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
