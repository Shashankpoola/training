package com.ey.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.ey.Dao.BookDao;
import com.ey.entity.Book;

public class TestBookDao {

	private static BookDao dao;

	@BeforeAll
	public static void init() {
		dao = new BookDao();
	}

	@Test
	public void testSave() {
		Book b = new Book(12343, "The Alchemist", "Paulo coelho", 249);
		dao.save(b);
	}

	@Test
	public void testList() {
		List<Book> books = dao.list();
		
		assertNotNull(books);
		books.forEach(System.out::println);
	}

	@Test
	public void testFIndByIsbn() {
		
		Book b = dao.findByIsbn(12343);
		assertNotNull(b);
		System.out.println(b);
	}
	@Test
	public void testUpdateByIsbn() {
		
		
	}
	@Test
	public void testDeleteByIsbn() {
		
	}
	@Test
	public void testFindByAuthor() {
		
		List<Book> books = dao.findByAuthor("Paul Coelho");
		assertNotNull(books);
		books.forEach(System.out::println);	
	}
}
