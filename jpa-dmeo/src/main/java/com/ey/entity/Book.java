package com.ey.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name  = "books")
@NamedQueries(
		@NamedQuery(name = "byauthor", query = "FROM Book WHERE author = :auth")
		
		)
public class Book {
	@Id //mandatory annotations to make a java object entity.
	private int isbn;
	@Column(length = 30)
	private String title;
	@Column(length = 30)
	private String author;
	private double price;

	public Book() {
	}

	public Book(int isbn, String title, String author, double price) {
		this.author= author;
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	//getter setetrs for all fields.
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}

}
