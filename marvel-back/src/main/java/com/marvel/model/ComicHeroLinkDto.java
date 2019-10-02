package com.marvel.model;

import java.util.Date;

public class ComicHeroLinkDto {

	
    private int comicHeroLinkId;
    private int comicId;
    private int idHero;
    private Date dateCroissement;
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
	public Date getDateCroissement() {
		return dateCroissement;
	}
	public void setDateCroissement(Date dateCroissement) {
		this.dateCroissement = dateCroissement;
	}
    
    
    
    
}
