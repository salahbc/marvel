import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { ShowHeroComponent } from './show-hero/show-hero.component';

import { ShowTeamComponent } from './show-team/show-team.component';


import { FindCharacterComponent } from './find-character/find-character.component';

import { AddCharacterComponent } from './add-character/add-character.component';


import { AddSuperTeamComponent } from './add-super-team/add-super-team.component';

const routes: Routes = [
  { path: '', redirectTo: 'accueil', pathMatch: 'full' },
  
  
  { path: 'accueil', component: ShowHeroComponent },
  
  
  { path: 'showTeam', component: ShowTeamComponent },


  { path: 'findCharacter', component: FindCharacterComponent },
  
  { path: 'addCharacter', component: AddCharacterComponent },

  { path: 'addSuperTeam', component: AddSuperTeamComponent },


  
  
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes,{ useHash: true }),
   ],
  exports: [RouterModule]
})
export class AppRoutingModule { }






