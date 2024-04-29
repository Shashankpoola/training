package com.ey.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ey.dto.BlogDto;
import com.ey.entity.Blog;
import com.ey.service.BlogService;

@RestController
public class BlogController {

	@Autowired
	private BlogService service;

	@PostMapping(value = "/blog/add", consumes = "application/json")
	public String addBlog(@RequestBody BlogDto b) {
		Blog bl = new Blog();
		
		bl.setBid(b.getBid());
		bl.setBname(b.getBname());
		
		service.add(bl);
		return "Added successfully";
	}

	@GetMapping(value = "/blog/{bid}", produces = "application/json")
	public Blog getBlog(@PathVariable int bid) {
		return service.get(bid);
	}
	
	@GetMapping(value = "/blog/all", produces = "application/json")
	public List<Blog> getAll() {
		return service.getAll();
	}
}
