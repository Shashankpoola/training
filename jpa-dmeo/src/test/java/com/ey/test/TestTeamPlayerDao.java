package com.ey.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ey.Dao.TeamPlayerDao;
import com.ey.entity.Team;

public class TestTeamPlayerDao {

	private static TeamPlayerDao dao;
	
	@BeforeAll
	public static void setup() {
		
		dao = new TeamPlayerDao();
		
	}
	
	@Test
	public void testsavePlayer() {
		
		Team team = new Team();
		team.setTeamId(123);
		team.setTeamName("CSK");
		dao.addTeam(team);
	}
	
	@Test
	public void testFindTeam() {
		
		Team team = dao.findTeam(123);
		System.out.println(team);
		team.getPlayers().forEach(System.out::println);
		
	}
	
	@Test
	public void testRemoveTeam() {
		dao.removeTeam(123);
		
	}	
}
