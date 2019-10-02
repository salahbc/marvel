package com.marvel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marvel.model.ApiResponse;
import com.marvel.model.Team;
import com.marvel.service.TeamService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/teams")
public class TeamController {
	
	
    @Autowired
    private TeamService TeamService;


    @GetMapping
    public ApiResponse<List<Team>> listTeam(){
        return new ApiResponse<>(HttpStatus.OK.value(), "Team list fetched successfully.",TeamService.findAll());
    }

}
