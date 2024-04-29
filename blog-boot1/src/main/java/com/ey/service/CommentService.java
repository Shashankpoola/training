package com.ey.service;

import java.util.List;

import com.ey.entity.Blog;
import com.ey.entity.Comment;

public interface CommentService {

	void add(Comment c, int bid);

	List<Comment> listByBlog(int bid);

	
	
	
}
