package com.ey.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ey.entity.Blog;

public interface BlogRepo extends JpaRepository<Blog, Integer> {

	Blog findByBid(int bid);

}
