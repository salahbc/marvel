package com.marvel.service.impl;

import com.marvel.dao.HeroDao;
import com.marvel.model.Hero;
import com.marvel.model.HeroDto;
import com.marvel.service.HeroService;

import org.springframework.beans.BeanUtils;
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
    public HeroDto update(HeroDto userDto) {
    	Hero user = findById(userDto.getId());
        if(user != null) {
            BeanUtils.copyProperties(userDto, user, "password");
            heroDao.save(user);
        }
        return userDto;
    }

	@Override
	public Hero save(HeroDto hero) {
		// TODO Auto-generated method stub
		return null;
	}

//    @Override
//    public User save(HeroDto user) {
//	    User newUser = new User();
//	    newUser.setUsername(user.getUsername());
//	    newUser.setFirstName(user.getFirstName());
//	    newUser.setLastName(user.getLastName());
//	    newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
//		newUser.setAge(user.getAge());
//		newUser.setSalary(user.getSalary());
//        return userDao.save(newUser);
//    }
}
