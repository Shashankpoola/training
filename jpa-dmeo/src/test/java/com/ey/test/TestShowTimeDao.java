package com.ey.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ey.Dao.ShowTimeDao;
import com.ey.entity.Movie;
import com.ey.entity.Multiplex;

public class TestShowTimeDao {

	private static ShowTimeDao dao;

	@BeforeAll
	public static void setup() {
		dao = new ShowTimeDao();
	}

	@Test
	public void testSaveMovie() {

		Movie movie = new Movie();
		movie.setMovId(123);
		movie.setTitle("Jawan");
		dao.addMovie(movie);
	}

	@Test
	public void testSaveMultiplex() {

		Multiplex multiplex = new Multiplex();
		multiplex.setMpexId(14);
		multiplex.setName("PVR");
		dao.addMultiplex(multiplex);
	}

	@Test
	public void testAddMovieToMultiplex() {
		dao.addMovieMultiplex(123, 14);
	}

	@Test
	public void testRemoveMovie() {
		dao.removeMovie(123);
	}

	@Test
	public void testRemoveMultiplex() {
		dao.removeMultiplex(10);
	}

}
