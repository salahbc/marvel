package com.marvel.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marvel.model.Hero;


@Repository
public interface HeroDao extends CrudRepository<Hero, Integer> {

    Hero findByName(String username);
    List<Hero> findAll();
}
