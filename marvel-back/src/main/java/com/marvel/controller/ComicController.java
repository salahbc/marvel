package com.marvel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marvel.model.ApiResponse;
import com.marvel.model.Comic;
import com.marvel.service.ComicService;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/comics")
public class ComicController {

	
	 @Autowired
	private ComicService ComicService;
	 
	 
	   @GetMapping
	    public ApiResponse<List<Comic>> listComic(){
	        return new ApiResponse<>(HttpStatus.OK.value(), "Comic list fetched successfully.",ComicService.findAll());
	    }
	 
}
