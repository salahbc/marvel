package com.marvel.service;

import java.util.List;

import com.marvel.model.Comic;
import com.marvel.model.ComicDto;

public interface ComicService {

    Comic save(ComicDto comic);
    List<Comic> findAll();
    void delete(int id);

    Comic findOne(String name);

    Comic findById(int id);

    ComicDto update(ComicDto comicDto);

}
