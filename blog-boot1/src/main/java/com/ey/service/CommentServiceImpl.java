package com.ey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ey.entity.Blog;
import com.ey.entity.Comment;
import com.ey.repo.BlogRepo;
import com.ey.repo.CommentRepo;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepo crepo;
	@Autowired
	private BlogRepo brepo;

	@Override
	public void add(Comment c, int bid) {

		Blog bl = brepo.findById(bid).get();
		c.setBlogs(bl);

		crepo.save(c);

	}

	@Override
	public List<Comment> listByBlog(int bid) {
		return crepo.findByBlogsBid(bid);
	}

}
