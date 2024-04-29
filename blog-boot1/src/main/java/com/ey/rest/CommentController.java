package com.ey.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ey.entity.Comment;
import com.ey.service.CommentService;

@RestController
public class CommentController {

	@Autowired
	private CommentService service;

	@PostMapping(value = "/comment/add/{bid}", consumes = "application/json")
	public String addComment(@RequestBody Comment c, @PathVariable int bid) {

		service.add(c, bid);
		return "cmt added succssfully";

	}

	@GetMapping(value = "/comment/listbyblog/{bid}", produces = "application/json")
	public List<Comment> listByBlog(@PathVariable int bid) {
		return service.listByBlog(bid);

	}

}
