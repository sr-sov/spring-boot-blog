package com.srsov.blog;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.srsov.blog.model.Post;
import com.srsov.blog.repository.PostRepository;


@SpringBootApplication
public class SpringBootBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBlogApplication.class, args);
	}
	
	
	/*
	@Bean
	CommandLineRunner commandLineRunner(PostRepository posts) {
		return args -> {
			posts.save(new Post("Hello, World!", "Welcome to my blog!"));
		};
	}
	*/
	@Bean
	CommandLineRunner commandLineRunner2(PostRepository posts) {
		return args -> {
			System.out.println(posts.findAll());
		};
	}

}
