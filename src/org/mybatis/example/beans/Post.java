package org.mybatis.example.beans;

import java.util.List;

public class Post {
	public int id;
	public String title;
	public List<String> tags;
	public List<PageDecorator> decorator;
	
	
	public List<PageDecorator> getDecorator() {
		return decorator;
	}

	public void setDecorator(List<PageDecorator> decorator) {
		this.decorator = decorator;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "\n\tPost [id=" + id + ", title=" + title + ", \n\t\t tags=" + tags + " \n\t\t decorator=" + decorator + "]";
	}

}
