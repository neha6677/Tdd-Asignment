package com.yash.tddAssignment.advance;

public class ApplicationNew {
	private int id;
	private String name;
	private  String date;
	public ApplicationNew(int id, String name, String date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "ApplicationNew [id=" + id + ", name=" + name + ", date=" + date + "]";
	}

	}
