package com.marvel.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team")
public class Team {
	
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private int teamId;
    @Column
    private String name;
    
    @Column
    private Date dateCreation;
    
//    
//    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
//    @JsonManagedReference(value = "Hero")
//    private List<Hero> hero = new ArrayList<Hero>();




	public String getName() {
		return name;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public Team(int teamId, String name, Date dateCreation) {
		super();
		this.teamId = teamId;
		this.name = name;
		this.dateCreation = dateCreation;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	
    


    
    
}
