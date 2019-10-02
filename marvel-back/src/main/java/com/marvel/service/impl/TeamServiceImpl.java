package com.marvel.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marvel.dao.TeamDao;
import com.marvel.model.Team;
import com.marvel.model.TeamDto;
import com.marvel.service.TeamService;


@Service(value = "teamService")
public class TeamServiceImpl  implements  TeamService {

	
	@Autowired
	private TeamDao teamDao;

	
	
	public List<Team> findAll() {
		List<Team> list = new ArrayList<>();
		list = teamDao.findAll();
		return list;
	}



	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Team findOne(String name) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Team findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public TeamDto update(TeamDto TeamDto) {
		// TODO Auto-generated method stub
		return null;
	}
}
