package com.ey.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Team {
	@Id
	@Column(name = "team_Id")
	private int teamId;
	@Column(name = "team_name", length = 20)
	private String teamName;
	@Column(length = 20)
	private String league;
	@OneToMany(mappedBy = "team", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
	private List<Player> players;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(int teamId, String teamName, String league, List<Player> players) {
		this.teamId = teamId;
		this.teamName = teamName;
		this.league = league;
		this.players = players;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getLeague() {
		return league;
	}

	public void setLeague(String league) {
		this.league = league;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
	
	
}
