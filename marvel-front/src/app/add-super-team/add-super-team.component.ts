import { Component, OnInit } from '@angular/core';
import { MatDialogRef} from '@angular/material';
import {ApiService} from "../core/api.service";
import {FormBuilder} from "@angular/forms";
import {Router} from "@angular/router";
import { InformationService } from '../shared/information.service';
import { NotificationService } from '../shared/notification.service';





@Component({
  selector: 'app-add-super-team',
  templateUrl: './add-super-team.component.html',
  styleUrls: ['./add-super-team.component.css']
})
export class AddSuperTeamComponent implements OnInit {

  constructor(private service: InformationService,public dialogRef: MatDialogRef<AddSuperTeamComponent>,private apiService: ApiService,private formBuilder: FormBuilder, private router: Router,private notificationService: NotificationService
    ) {
    
   }

   nameTeam: any;
   idTeam: any;
   teams: any;


   ngOnInit() {
    this.nameTeam = window.localStorage.getItem("nameTeam");
    this.idTeam = window.localStorage.getItem("idHero");
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

      if (this.service.form.invalid) {
        return;
      }
      this.service.updateHeroTeam();
      this.notificationService.success('Le super hero est bien ajouté dans le team');
      this.dialogRef.close();
    }
  

   
 

}
