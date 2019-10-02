package com.marvel.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marvel.model.ComicHeroLink;



@Repository
public interface ComicHeroLinkDao extends CrudRepository<ComicHeroLink, Integer> {

	ComicHeroLink findById(int id);
    List<ComicHeroLink> findAll();

    List<ComicHeroLink> findForDashBoardComic(String dateDeb,String dateFin,int idHero);
    
    
    List<ComicHeroLink> findFinalComicDashboard(String deb,String fin,int idComic,int idHero);
}
