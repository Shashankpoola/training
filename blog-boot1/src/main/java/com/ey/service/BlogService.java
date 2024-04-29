package com.ey.service;

import java.util.List;

import com.ey.entity.Blog;

public interface BlogService {
	
	void add(Blog b);
	
	Blog get(int bid);
	
	List<Blog> getAll();
	
	
	
}
