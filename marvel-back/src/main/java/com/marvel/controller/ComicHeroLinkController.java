package com.marvel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marvel.model.ApiResponse;
import com.marvel.model.ComicHeroLink;
import com.marvel.model.ComicSearchLinkHero;
import com.marvel.service.ComicHeroLinkService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/comicsHeroLink")
public class ComicHeroLinkController {


		
		@Autowired
		private ComicHeroLinkService ComicHeroLinkService;
		 
		 
		   @GetMapping
		    public ApiResponse<List<ComicHeroLink>> listComicHeroLink(){
		        return new ApiResponse<>(HttpStatus.OK.value(), "ComicHeroLink list fetched successfully.",ComicHeroLinkService.findAll());
		    }
		   
		   
		   
		   
		   
		   
		    @RequestMapping(value = "/getComicHeroLinkWithSearch", method = RequestMethod.POST)
		    public ApiResponse<List<ComicHeroLink>> listDemandeDashboard(@RequestBody ComicSearchLinkHero searchLinkWithComic)  {
		        return new ApiResponse<>(HttpStatus.OK.value(), "Demande list fetched successfully with criteria recherche.",ComicHeroLinkService.findForDashBoardComic(searchLinkWithComic));
		       }

		 
	
}
