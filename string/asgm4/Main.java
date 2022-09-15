package com.yash.tddAssignment.string.asgm4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Category c = new Category(); c.setId("101"); c.setName("javabasics");
		 * c.setCreatedDate("31-01-2017");
		 * 
		 * System.out.println(c.showCategoryDetail());
		 */

	}

	public String settingDetails() {
		Category c = new Category();
		c.setId("101");
		c.setName("javabasics");
		c.setCreatedDate("31-01-2017");
		return c.showCategoryDetail();
	}

}
