package org.mybatis.example.beans;

public class PageDecorator {
	public String id;
	public String decoratorName;
	
	 
	public PageDecorator() {
		super();
		System.out.println("Decorator created ...");
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDecoratorName() {
		return decoratorName;
	}
	public void setDecoratorName(String decoratorName) {
		this.decoratorName = decoratorName;
	}
	@Override
	public String toString() {
		return "\n\t PageDecorator [id=" + id + ", decoratorName=" + decoratorName + "]";
	}
	
	
	
}
