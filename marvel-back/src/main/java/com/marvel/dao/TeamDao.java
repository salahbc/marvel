package com.marvel.dao;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marvel.model.Hero;
import com.marvel.model.Team;


@Repository
public interface TeamDao extends CrudRepository<Team, Integer> {

    Hero findByName(String username);
    List<Team> findAll();
}
