package com.marvel.model;

import java.util.Date;

public class TeamDto {


    private int id;
    private String name;
    private Date dateCreation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public TeamDto(int id, String name, Date dateCreation) {
		super();
		this.id = id;
		this.name = name;
		this.dateCreation = dateCreation;
	}
	public TeamDto() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
    
}
