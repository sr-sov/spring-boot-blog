package com.srsov.blog.repository;

import org.springframework.data.repository.CrudRepository;

import com.srsov.blog.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
