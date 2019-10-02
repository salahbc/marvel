
import { Component, OnInit ,ViewChild,ChangeDetectorRef,AfterContentChecked} from '@angular/core';
import {Router} from "@angular/router";
import {ApiService} from "../core/api.service";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import { MatTableDataSource,MatSort,MatPaginator, MatDialog, MatDialogConfig  } from '@angular/material';
import * as moment from 'moment';


@Component({
  selector: 'app-comic-link-hero',
  templateUrl: './comic-link-hero.component.html',
  styleUrls: ['./comic-link-hero.component.css']
})
export class ComicLinkHeroComponent implements OnInit {

    rechercheForm: FormGroup;
    listData: MatTableDataSource<any>;
    displayedColumns: string[] = ['nom', 'nbr','actions'];
    @ViewChild(MatSort, { static: false }) sort: MatSort;
    @ViewChild(MatPaginator, { static: false }) paginator: MatPaginator;
    searchKey: string;
    comicLinkedHero:any;
    formattedDateDeb: string;
    formattedDateFin: string;
  
    invalidUser: boolean = false
  constructor(private formBuilder: FormBuilder, private router: Router, private apiService: ApiService, private dialog: MatDialog,private changeDetectorRefs: ChangeDetectorRef) {
    }

    ngAfterContentChecked() {
      this.changeDetectorRefs.detectChanges();
  }

  ngOnInit() {

    this.rechercheForm = this.formBuilder.group({
      dateDeb: ['', Validators.compose([Validators.required])],
      dateFin: ['', Validators.required]
    });
  }

  applyFilter() {
    this.listData.filter = this.searchKey.trim().toLowerCase();
  }



  onSubmit()
  {

    if (this.rechercheForm.invalid) {
      return;
    }
    
   const momentDateDeb = new Date(this.rechercheForm.controls.dateDeb.value);
   this.formattedDateDeb = moment(momentDateDeb).format("YYYY-MM-DD");
 
   const momentDateFin = new Date(this.rechercheForm.controls.dateFin.value);
   this.formattedDateFin = moment(momentDateFin).format("YYYY-MM-DD");

   
   const recherInformation = {
    dateDebut: this.formattedDateDeb,
    dateFin: this.formattedDateFin,
    idHero: window.localStorage.getItem("idHero"),
  }



  this.apiService.getHeroLinkedComic(recherInformation)
  .subscribe( data => {
    
    this.comicLinkedHero=data.result
  });

  }
}
