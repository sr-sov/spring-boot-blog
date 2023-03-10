package com.srsov.blog.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

public class Post {
	
	@Id
	private Integer id;
	private String title;
	private String content;
	private LocalDateTime publishedOn;
	private LocalDateTime updatedOn;
	//author
	//comments
	
	//constructor
	public Post(String title, String content) {
		this.title = title;
		this.content = content;
		this.publishedOn = LocalDateTime.now();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getPublishedOn() {
		return publishedOn;
	}

	public void setPublishedOn(LocalDateTime publishedOn) {
		this.publishedOn = publishedOn;
	}

	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", content=" + content + ", publishedOn=" + publishedOn
				+ ", updatedOn=" + updatedOn + "]";
	}

	

}
