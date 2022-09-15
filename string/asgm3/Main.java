package com.yash.tddAssignment.string.asgm3;

public class Main {

	public static void main(String[] args) {
		/*
		 * Section s = new Section(); s.setId("101"); s.setName("core_jave");
		 * s.setCreatedDate("31-01-2017"); System.out.println(s.showSectionDetail());
		 */

	}
	
	public static String setDetails() {
		Section s = new Section();
		s.setId("101");
		s.setName("core_jave");
		s.setCreatedDate("31-01-2017");
		return s.showSectionDetail();
	}

}
