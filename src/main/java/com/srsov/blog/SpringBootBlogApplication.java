package com.srsov.blog;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jdbc.core.mapping.AggregateReference;

import com.srsov.blog.model.Author;
import com.srsov.blog.model.Comment;
import com.srsov.blog.model.Post;
import com.srsov.blog.repository.AuthorRepository;
import com.srsov.blog.repository.PostRepository;


@SpringBootApplication
public class SpringBootBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBlogApplication.class, args);
	}
	
	
	
	@Bean
	CommandLineRunner commandLineRunner(PostRepository posts, AuthorRepository authors) {
		return args -> {
			AggregateReference<Author, Integer> dan = AggregateReference.to(authors.save(new Author(null, "Dan", "Vega", "danvega@gmail.com", "dvega")).id());
			Post post = new Post("Hello, World!", "Welcome to my blog!", dan);
			post.addComment(new Comment("Dan", "This is my first comment"));
			posts.save(post);
		};
	}
	
	@Bean
	CommandLineRunner commandLineRunner2(PostRepository posts) {
		return args -> {
			System.out.println(posts.findAll());
		};
	}

}
