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
   fileToUpload: File = null;




  ngOnInit() {

    this.apiService.getTeams()
    .subscribe( data => {
     
      console.log(data.result);
      this.teams=data.result
    
    });

  }


  handleFileInput(files: FileList) {
    console.log(this.fileToUpload)
    this.fileToUpload = files.item(0);
}







  onClose() {
    this.service.form1.reset();
    this.service.initializeFormGroup1();
    this.dialogRef.close();
  } 


  onSubmit()
  {

    if (this.service.form1.invalid) {
      return;
    }


    this.apiService.postImage(this.fileToUpload).subscribe(data => {
      // do something, if upload success
      }, error => {
        console.log(error);
      });

    this.service.saveHero(this.fileToUpload.name);
    this.notificationService.success('Le super hero est bien ajouté');
    this.dialogRef.close();
  }







}
