package com.marvel.service;

import java.util.List;


import com.marvel.model.Team;
import com.marvel.model.TeamDto;

public interface TeamService {

 
    List<Team> findAll();
    void delete(int id);

    Team findOne(String name);

    Team findById(int id);

    TeamDto update(TeamDto TeamDto);
}
