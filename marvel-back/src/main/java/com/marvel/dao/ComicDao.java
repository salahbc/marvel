package com.marvel.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marvel.model.Comic;

@Repository
public interface ComicDao extends CrudRepository<Comic, Integer> {

	Comic findByName(String username);
    List<Comic> findAll();
}
