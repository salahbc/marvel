package com.marvel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;



@NamedQueries({
@NamedQuery(name = "ComicHeroLink.findForDashBoardComic", query = "SELECT new com.marvel.model.ComicHeroLink ("
  + "comLink.comicId "
  + " )FROM ComicHeroLink comLink "
  + " WHERE "
  + "comLink.dateCroissement BETWEEN ?1 and ?2  and  comLink.idHero = ?3 "
  ), 

@NamedQuery(name = "ComicHeroLink.findFinalComicDashboard", query = "SELECT new com.marvel.model.ComicHeroLink ("
		  + "count(*), "
    	  +" hero.name as name"
		  + " )FROM ComicHeroLink comLink "
		  +" left join comLink.hero hero"
		  + " WHERE comLink.dateCroissement >= ?1 and comLink.dateCroissement<= ?2 and comLink.comicId = ?3 and comLink.idHero <> ?4 "
		  +" group by comLink.comicId , hero.name"
		  +" order by count(*) desc "
		), 
})
@Entity
@Table(name = "comicherolink")
public class ComicHeroLink {

	
	  	@Id
	    @GeneratedValue(strategy= GenerationType.SEQUENCE)
	    private int comicHeroLinkId;
	    @Column
	    private int comicId;
	    @Column
	    private int idHero;
	    @Column
	    private String dateCroissement;
	    
	    
	    @Transient
	    private long nbr;
	    
	    @Transient
	    private String nameHero;
	    
	    
	    @ManyToOne(fetch =FetchType.LAZY)
	    @JoinColumn(name="idHero", insertable = false, updatable = false)
	    @Fetch(FetchMode.JOIN)
	    private Hero hero;
	    
	    
		public int getComicHeroLinkId() {
			return comicHeroLinkId;
		}
		public void setComicHeroLinkId(int comicHeroLinkId) {
			this.comicHeroLinkId = comicHeroLinkId;
		}
		public int getComicId() {
			return comicId;
		}
		public void setComicId(int comicId) {
			this.comicId = comicId;
		}
	
		
		

		
		
		
		
		
		public int getIdHero() {
			return idHero;
		}
		public void setIdHero(int idHero) {
			this.idHero = idHero;
		}
		public String getDateCroissement() {
			return dateCroissement;
		}
		public void setDateCroissement(String dateCroissement) {
			this.dateCroissement = dateCroissement;
		}
		public Hero getHero() {
			return hero;
		}
		public void setHero(Hero hero) {
			this.hero = hero;
		}


		
		
		public long getNbr() {
			return nbr;
		}
		public void setNbr(long nbr) {
			this.nbr = nbr;
		}
		
		
		
		
		public String getNameHero() {
			return nameHero;
		}
		public void setNameHero(String nameHero) {
			this.nameHero = nameHero;
		}
		public ComicHeroLink() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public ComicHeroLink(int comicHeroLinkId, int comicId, int idHero, String dateCroissement) {
			super();
			this.comicHeroLinkId = comicHeroLinkId;
			this.comicId = comicId;
			this.idHero = idHero;
			this.dateCroissement = dateCroissement;
		}
		public ComicHeroLink(int comicId) {
			super();
			this.comicId = comicId;
		}
		
		
		
		
		public ComicHeroLink(long nbr, String nameHero) {
			super();
			this.nbr = nbr;
			this.nameHero = nameHero;
		}
		
		
	
		
		
		
	
		
		
		
	    
	    
	    
	    
	    
	    
}
