package com.ey.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "comments")
public class Comment {

	@Id
	private int cid;

	@Column(length = 20)
	private String message;

	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "bid")
	private Blog blogs;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Blog getBlogs() {
		return blogs;
	}

	public void setBlogs(Blog blogs) {
		this.blogs = blogs;
	}

}
