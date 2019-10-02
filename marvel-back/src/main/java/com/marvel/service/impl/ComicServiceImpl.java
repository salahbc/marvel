package com.marvel.service.impl;

import com.marvel.dao.ComicDao;
import com.marvel.model.Comic;
import com.marvel.model.ComicDto;
import com.marvel.service.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service(value = "comicService")
public class ComicServiceImpl implements  ComicService {
	
	@Autowired
	private ComicDao comicDao;



	public List<Comic> findAll() {
		List<Comic> list = new ArrayList<>();
		list = comicDao.findAll();
		return list;
	}

	@Override
	public void delete(int id) {
		comicDao.deleteById(id);
	}

	@Override
	public Comic findOne(String username) {
		return comicDao.findByName(username);
	}

	@Override
	public Comic findById(int id) {
		Optional<Comic> optionalUser = comicDao.findById(id);
		return optionalUser.isPresent() ? optionalUser.get() : null;
	}

    @Override
    public ComicDto update(ComicDto comicDto) {
    	Comic hero = findById(comicDto.getComicId());
 
        return comicDto;
    }



    @Override
    public Comic save(ComicDto comicDto) {
    	Comic newComic = new Comic();
    	newComic.setName(comicDto.getName());
    	newComic.setDescription(comicDto.getDescription());
        return comicDao.save(newComic);
    }


}

