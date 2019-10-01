



import { Component, OnInit ,ViewChild,ChangeDetectorRef,AfterContentChecked} from '@angular/core';
import {Router} from "@angular/router";
import {ApiService} from "../core/api.service";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import { MatTableDataSource,MatSort,MatPaginator, MatDialog, MatDialogConfig  } from '@angular/material';
import * as moment from 'moment';


import { AddCharacterComponent } from '../add-character/add-character.component';

import { AddSuperTeamComponent } from '../add-super-team/add-super-team.component';


@Component({
  selector: 'app-show-hero',
  templateUrl: './show-hero.component.html',
  styleUrls: ['./show-hero.component.css']
})
export class ShowHeroComponent   implements OnInit, AfterContentChecked  {



    // dataSource: MatTableDataSource<PeriodicElement>;
    rechercheForm: FormGroup;

    listData: MatTableDataSource<any>;
    displayedColumns: string[] = ['nom', 'vignette', 'description','actions'];
    @ViewChild(MatSort, { static: false }) sort: MatSort;
    @ViewChild(MatPaginator, { static: false }) paginator: MatPaginator;
    searchKey: string;
    selected: any;
    formattedDateDeb: string;
    formattedDateFin: string;
  
    invalidUser: boolean = false
  constructor(private formBuilder: FormBuilder, private router: Router, private apiService: ApiService, private dialog: MatDialog,private changeDetectorRefs: ChangeDetectorRef) {
    }
    
    
   ngAfterContentChecked() {
    this.changeDetectorRefs.detectChanges();
}


  ngOnInit() {

    this.apiService.getHeroes()
    .subscribe( data => {
     
      console.log(data.result);

       this.listData = new MatTableDataSource(data.result);


       console.log(this.listData);
       
       this.listData.paginator = this.paginator;
   
       this.listData.sort = this.sort;
    
    });
  }

  applyFilter() {
    this.listData.filter = this.searchKey.trim().toLowerCase();
  }
  
  onSubmit() {
  }


  add()
  {
  
      const dialogConfig = new MatDialogConfig();
     dialogConfig.disableClose = true;
     dialogConfig.autoFocus = true;
      dialogConfig.width = "60%";
 
     this.dialog.open(AddCharacterComponent,dialogConfig);

  }



  
  onEdit(row){
    this.selected = row;
    console.log(this.selected.team.name);
    window.localStorage.setItem("nameTeam", this.selected.team.name);
    window.localStorage.setItem("idTeam", this.selected.team.id);
    window.localStorage.setItem("idHero", this.selected.id);

    const dialogConfig = new MatDialogConfig();
    dialogConfig.disableClose = true;
    dialogConfig.autoFocus = true;
    dialogConfig.width = "60%";
    this.dialog.open(AddSuperTeamComponent,dialogConfig);
 }

}
