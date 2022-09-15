package com.yash.tddAssignment.string.asgm4;

public class Category {

	private String  id;
	private String name;
	private String createdDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
	public String showCategoryDetail() {
		return "Category [id=" + id + ", name=" + name + ", createdDate=" + createdDate + "]";
	}
	
	
}
