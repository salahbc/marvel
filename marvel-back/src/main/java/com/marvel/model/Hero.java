package com.marvel.model;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


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
    
    @Column
    private Integer teamId;
    
    
    
    
    @ManyToOne(fetch =FetchType.LAZY)
    @JoinColumn(name="teamId", insertable = false, updatable = false)
    @Fetch(FetchMode.JOIN)
    private Team team;
    
    
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
	
	
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	
	
	public Hero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	
	
	
	
	public Hero(int id, String name, String vignette, String description, int teamId, Team team) {
		super();
		this.id = id;
		this.name = name;
		this.vignette = vignette;
		this.description = description;
		this.teamId = teamId;
		this.team = team;
	}
	
	
	



	
	
    
    

}
