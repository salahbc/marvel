package com.marvel.service;

import java.util.List;

import com.marvel.model.ComicHeroLink;
import com.marvel.model.ComicHeroLinkDto;
import com.marvel.model.ComicSearchLinkHero;

public interface ComicHeroLinkService {

	
	   	ComicHeroLink save(ComicHeroLinkDto comic);
	   	
	    List<ComicHeroLink> findAll();
	    
	    void delete(int id);

	    ComicHeroLink findOne(int name);

	    ComicHeroLink findById(int id);

	    ComicHeroLinkDto update(ComicHeroLinkDto comicDto);
	    
	    

		List<ComicHeroLink> findForDashBoardComic(ComicSearchLinkHero rechercheDemande); 
	
}
