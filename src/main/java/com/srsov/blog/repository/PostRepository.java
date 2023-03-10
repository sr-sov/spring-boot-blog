package com.srsov.blog.repository;

import org.springframework.data.repository.CrudRepository;

import com.srsov.blog.model.Post;

public interface PostRepository extends CrudRepository<Post, Integer>{

}
