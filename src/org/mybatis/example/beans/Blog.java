package org.mybatis.example.beans;

import java.util.List;

public class Blog {
	public int id;
	public String name;
	public String url;
	public Author author;
	public List<Post> posts;
	public List<PageDecorator> decorator;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		System.out.println("Setting Author");
		this.author = author;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	
	public List<PageDecorator> getDecorator() {
		return decorator;
	}

	public void setDecorator(List<PageDecorator> decorator) {
		System.out.println("Setting Decorator");
		this.decorator = decorator;
	}

	@Override
	public String toString() {
		return "\nBlog [id=" + id + ", name=" + name + ", url=" + url + ", author=" + author + ", \n\tposts=" + posts + ", \n\tdecorator=" + decorator + "]";
	}


	
}
