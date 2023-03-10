package com.srsov.blog.model.dto;

import com.srsov.blog.model.Author;
import com.srsov.blog.model.Post;

public record PostDetails(Post post, Author author) {

}
