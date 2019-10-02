import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


import { ShowHeroComponent } from './show-hero/show-hero.component';


import { ComicLinkHeroComponent } from './comic-link-hero/comic-link-hero.component';


import { AddCharacterComponent } from './add-character/add-character.component';


import { AddSuperTeamComponent } from './add-super-team/add-super-team.component';

const routes: Routes = [
  { path: '', redirectTo: 'accueil', pathMatch: 'full' },
  
  
  { path: 'accueil', component: ShowHeroComponent },
  

  { path: 'comicLinkHero', component: ComicLinkHeroComponent },
  
  { path: 'addCharacter', component: AddCharacterComponent },

  { path: 'addSuperTeam', component: AddSuperTeamComponent },


  
  
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes,{ useHash: true }),
   ],
  exports: [RouterModule]
})
export class AppRoutingModule { }






