package com.marvel.controller;

import com.marvel.model.ApiResponse;
import com.marvel.model.Hero;
import com.marvel.model.HeroDto;
import com.marvel.service.HeroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/heroes")
public class HeroController {

    @Autowired
    private HeroService HeroService;

    @PostMapping
    public ApiResponse<Hero> saveHero(@RequestBody HeroDto Hero){
        return new ApiResponse<>(HttpStatus.OK.value(), "Hero saved successfully.",HeroService.save(Hero));
    }

    @GetMapping
    public ApiResponse<List<Hero>> listHero(){
        return new ApiResponse<>(HttpStatus.OK.value(), "Hero list fetched successfully.",HeroService.findAll());
    }

    @GetMapping("/{id}")
    public ApiResponse<Hero> getOne(@PathVariable int id){
        return new ApiResponse<>(HttpStatus.OK.value(), "Hero fetched successfully.",HeroService.findById(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<HeroDto> update(@RequestBody HeroDto HeroDto) {
        return new ApiResponse<>(HttpStatus.OK.value(), "Hero updated successfully.",HeroService.update(HeroDto));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable int id) {
        HeroService.delete(id);
        return new ApiResponse<>(HttpStatus.OK.value(), "Hero fetched successfully.", null);
    }



}
