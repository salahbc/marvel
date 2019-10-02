import { Injectable } from '@angular/core';
import { FormGroup, FormControl, Validators } from "@angular/forms";
import * as _ from 'lodash';
import {ApiService} from "../core/api.service";
import { MatTableDataSource} from '@angular/material';
import { NotificationService } from '../shared/notification.service';


@Injectable({
  providedIn: 'root'
})
export class InformationService {

 
  constructor(private apiService: ApiService,private notificationService: NotificationService) { }

  listData: MatTableDataSource<any>;
  demandeLine: any;

  demandes: any;
  statuts: any;




  formOne: FormGroup = new FormGroup({
    nom: new FormControl('', Validators.required),
    // prenom: new FormControl('', Validators.required),
    description: new FormControl('', Validators.required),
  });


  form: FormGroup = new FormGroup({
    Team: new FormControl('', Validators.required),
  });

  initializeFormGroup() {
    this.form.setValue({
      Team: '0'
    });
  }


  
  initializeFormGroup1() {
    this.formOne.setValue({
      nom: '',
      description: '',
    });
  }

   saveHero(fileName) {
    

    const saveHeroload = {
      name: this.formOne.controls.nom.value,
      description : this.formOne.controls.description.value,
      vignette: fileName
    }
    this.apiService.saveHero(saveHeroload).subscribe(data => {});

   }



   updateHeroTeam()
   {
    const updateHero = {
     
      id: window.localStorage.getItem("idHero"),
      teamId : this.form.controls.Team.value
    }
    this.apiService.updateHero(updateHero).subscribe(data => {});

   }







  populateForm(employee) {
    this.form.patchValue(employee);

  }
}