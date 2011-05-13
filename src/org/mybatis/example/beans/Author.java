package org.mybatis.example.beans;

public class Author {
	public int id;
	public String name;
	public String email;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "\n\tAuthor [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
