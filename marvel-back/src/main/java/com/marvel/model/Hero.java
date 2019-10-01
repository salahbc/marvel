package com.marvel.model;

import javax.persistence.*;


@Entity
@Table(name = "hero")
public class Hero {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String vignette;
    @Column
    private String description;
    
    
    
//    @ManyToOne(optional=false)
//    @JoinColumn(name="team_id", nullable=false)
//    private Team team;
    
    
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
	public String getVignette() {
		return vignette;
	}
	public void setVignette(String vignette) {
		this.vignette = vignette;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
	public Hero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hero(int id, String name, String vignette, String description) {
		super();
		this.id = id;
		this.name = name;
		this.vignette = vignette;
		this.description = description;
	}


	
	
    
    

}
