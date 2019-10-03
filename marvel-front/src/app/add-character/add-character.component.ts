import { Component, OnInit } from '@angular/core';
import { MatDialogRef } from '@angular/material';
import {ApiService} from "../core/api.service";
import {FormBuilder} from "@angular/forms";
import {Router} from "@angular/router";
import { InformationService } from '../shared/information.service';
import { NotificationService } from '../shared/notification.service';




@Component({
  selector: 'app-add-character',
  templateUrl: './add-character.component.html',
  styleUrls: ['./add-character.component.css']
})
export class AddCharacterComponent implements OnInit {

  constructor(private service: InformationService,private apiService: ApiService,private formBuilder: FormBuilder, private router: Router,private notificationService: NotificationService
    ) {
    
   //   ,public dialogRef: MatDialogRef<AddCharacterComponent>

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
    this.service.formOne.reset();
    this.service.initializeFormGroup1();
    // this.dialogRef.close();
  } 


  onSubmit()
  {

    if (this.service.formOne.invalid) {
      return;
    }


    this.apiService.postImage(this.fileToUpload).subscribe(data => {
      }, error => {
        console.log(error);
      });

    this.service.saveHero(this.fileToUpload.name);
    this.notificationService.success('Le super hero est bien ajouté');
    // this.dialogRef.close();
    this.router.navigate(['/accueil']);
  }

}
