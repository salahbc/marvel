package com.marvel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comic")
public class Comic {
	
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private int comicId;
    @Column
    private String name;
    @Column
    private String description;
	public int getComicId() {
		return comicId;
	}
	public void setComicId(int comicId) {
		this.comicId = comicId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public Comic(int comicId, String name, String description) {
		super();
		this.comicId = comicId;
		this.name = name;
		this.description = description;
	}
	public Comic() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
    
    
    
    

}
