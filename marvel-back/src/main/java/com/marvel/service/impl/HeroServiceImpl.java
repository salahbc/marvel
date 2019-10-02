package com.marvel.service.impl;

import com.marvel.dao.HeroDao;
import com.marvel.model.Hero;
import com.marvel.model.HeroDto;
import com.marvel.service.HeroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service(value = "heroService")
public class HeroServiceImpl implements  HeroService {
	
	@Autowired
	private HeroDao heroDao;



	public List<Hero> findAll() {
		List<Hero> list = new ArrayList<>();
		list = heroDao.findAll();
		return list;
	}

	@Override
	public void delete(int id) {
		heroDao.deleteById(id);
	}

	@Override
	public Hero findOne(String username) {
		return heroDao.findByName(username);
	}

	@Override
	public Hero findById(int id) {
		Optional<Hero> optionalUser = heroDao.findById(id);
		return optionalUser.isPresent() ? optionalUser.get() : null;
	}

    @Override
    public HeroDto update(HeroDto heroDto) {
    	Hero hero = findById(heroDto.getId());
        if(hero != null) {
           // BeanUtils.copyProperties(heroDto, hero, "teamId");
            hero.setTeamId(heroDto.getTeamId());
            heroDao.save(hero);
        }
        return heroDto;
    }



    @Override
    public Hero save(HeroDto hero) {
    	Hero newHero = new Hero();
    	newHero.setName(hero.getName());
    	newHero.setDescription(hero.getDescription());
    	newHero.setTeamId(0);
    	newHero.setVignette(hero.getVignette());
        return heroDao.save(newHero);
    }


}
