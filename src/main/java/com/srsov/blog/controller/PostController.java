package com.srsov.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srsov.blog.model.Post;
import com.srsov.blog.repository.AuthorRepository;
import com.srsov.blog.repository.PostRepository;

@RestController
@RequestMapping("/api/posts")
public class PostController {
	
	private final PostRepository posts;
	private final AuthorRepository authors;
	public PostController(PostRepository posts, AuthorRepository authors) {
		this.posts = posts;
		this.authors = authors;
	}
	
	@GetMapping
	public Iterable<Post> findAll() {
		return posts.findAll();
	}
}
