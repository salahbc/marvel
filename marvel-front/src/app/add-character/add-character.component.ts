import { Component, OnInit } from '@angular/core';



import { MatDialogRef, MatRadioChange, MatRadioButton } from '@angular/material';


import {ApiService} from "../core/api.service";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
//import { NotificationService } from '../shared/notification.service';



@Component({
  selector: 'app-add-character',
  templateUrl: './add-character.component.html',
  styleUrls: ['./add-character.component.css']
})
export class AddCharacterComponent implements OnInit {

  constructor(public dialogRef: MatDialogRef<AddCharacterComponent>,private apiService: ApiService,private formBuilder: FormBuilder, private router: Router
   
   // ,private notificationService: NotificationService
    ) {
    
   }

  ngOnInit() {
  }

}
