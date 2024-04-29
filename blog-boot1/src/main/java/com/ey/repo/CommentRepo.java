package com.ey.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ey.entity.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{
	
	
//	
//	@Query("FROM Blog WHERE blogs.bid=:bid")
//	List<Comment> listByBlog(int bid);
	
	List<Comment> findByBlogsBid(int bid);
	
}
