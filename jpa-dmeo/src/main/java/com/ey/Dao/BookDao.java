package com.ey.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ey.entity.Book;

public class BookDao {

	private EntityManagerFactory factory;

	public BookDao() {

		factory = Persistence.createEntityManagerFactory("MyJPA");

	}

	public void save(Book bk) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction(); // for DML operations transactions are mandatory.

		txn.begin();
		em.persist(bk);
		txn.commit();
		em.close();

	}

	public List<Book> list() {
		EntityManager em = factory.createEntityManager();

		Query query = em.createQuery("FROM Book");
		return query.getResultList();

	}

	public Book findByIsbn(int isbn) {

		EntityManager em = factory.createEntityManager();
		return em.find(Book.class, isbn);

	}

	public void update(Book bk) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		txn.begin();
		em.merge(bk);
		txn.commit();
		em.close();

	}

	public void delete(Book bk) {

	}

	public List<Book> findByAuthor(String author) {
		
		String hql = "FROM Book WHERE author = auth"; //normal query
		EntityManager em = factory.createEntityManager();
		Query query = em.createQuery(hql);
		Query query1 = em.createNamedQuery("byauthor"); //named query
		query1.setParameter("auth", author);
		return query1.getResultList();	
		
	}

}
