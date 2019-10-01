package com.marvel.service;

import java.util.List;


import com.marvel.model.Hero;
import com.marvel.model.HeroDto;

public interface HeroService {

    Hero save(HeroDto hero);
    List<Hero> findAll();
    void delete(int id);

    Hero findOne(String name);

    Hero findById(int id);

    HeroDto update(HeroDto heroDto);

}
