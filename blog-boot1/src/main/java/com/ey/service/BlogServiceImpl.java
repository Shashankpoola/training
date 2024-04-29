package com.ey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ey.entity.Blog;
import com.ey.repo.BlogRepo;
@Service
public class BlogServiceImpl implements BlogService{

	@Autowired
	private BlogRepo brepo;
	
	@Override
	public void add(Blog b) {
		brepo.save(b);	
	}

	@Override
	public Blog get(int bid) {
		return brepo.findById(bid).get();
	}

	@Override
	public List<Blog> getAll() {
		return brepo.findAll();
	}

}
