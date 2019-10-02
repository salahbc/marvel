package com.marvel.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marvel.dao.ComicHeroLinkDao;
import com.marvel.model.ComicHeroLink;
import com.marvel.model.ComicHeroLinkDto;
import com.marvel.model.ComicSearchLinkHero;
import com.marvel.service.ComicHeroLinkService;

@Service(value = "comicHeroLinkService")
public class ComicHeroLinkServiceImpl implements ComicHeroLinkService {

	
	@Autowired
	private ComicHeroLinkDao comicHeroLinkDao;
	
	@Override
	public List<ComicHeroLink> findForDashBoardComic(ComicSearchLinkHero rechercheDemande) {

	 List<ComicHeroLink> list = new ArrayList<>();
	 List<ComicHeroLink> finalList = new ArrayList<>();
	 
	 
	 String dateDeb=rechercheDemande.getDateDebut();
	 String dateFin=rechercheDemande.getDateFin();
	 int idHero=rechercheDemande.getIdHero();

	 list=comicHeroLinkDao.findForDashBoardComic(dateDeb,dateFin,idHero); 
	 
	 System.out.println("list "+list.size());
	 
	 for(int i=0;i<list.size();i++)
	 {
		 
		 System.out.println("list getComicId : "+list.get(i).getComicId());
		 
		 finalList.addAll(i, comicHeroLinkDao.findFinalComicDashboard(dateDeb,dateFin,list.get(i).getComicId(),idHero)); 
		 
		 
		 System.out.println("finalList nbr "+finalList.get(i).getNbr());
		 
	 }
	 

	 return finalList;
	}
	
	
	
	

	public List<ComicHeroLink> findAll() {
		List<ComicHeroLink> list = new ArrayList<>();
		list = comicHeroLinkDao.findAll();
		return list;
	}

	@Override
	public void delete(int id) {
		comicHeroLinkDao.deleteById(id);
	}

	@Override
	public ComicHeroLink findOne(int id) {
		return comicHeroLinkDao.findById(id);
	}





    @Override
    public ComicHeroLink save(ComicHeroLinkDto comicHeroLinkDto) {
    	ComicHeroLink newComic = new ComicHeroLink();
    	newComic.setComicId(comicHeroLinkDto.getComicHeroLinkId());
    	newComic.setIdHero(comicHeroLinkDto.getIdHero());
        return comicHeroLinkDao.save(newComic);
    }

	@Override
	public ComicHeroLink findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComicHeroLinkDto update(ComicHeroLinkDto comicDto) {
		// TODO Auto-generated method stub
		return null;
	}















}
