import { Component, OnInit } from '@angular/core';



import { MatDialogRef, MatRadioChange, MatRadioButton } from '@angular/material';


import {ApiService} from "../core/api.service";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import { InformationService } from '../shared/information.service';
import { NotificationService } from '../shared/notification.service';




@Component({
  selector: 'app-add-character',
  templateUrl: './add-character.component.html',
  styleUrls: ['./add-character.component.css']
})
export class AddCharacterComponent implements OnInit {

  constructor(private service: InformationService,public dialogRef: MatDialogRef<AddCharacterComponent>,private apiService: ApiService,private formBuilder: FormBuilder, private router: Router,private notificationService: NotificationService
    ) {
    
   }
    
   teams: any;

  ngOnInit() {

    this.apiService.getTeams()
    .subscribe( data => {
     
      console.log(data.result);
      this.teams=data.result
    
    });

  }



  onClose() {
    this.service.form.reset();
    this.service.initializeFormGroup();
    this.dialogRef.close();
  } 


  onSubmit()
  {



  }


}
