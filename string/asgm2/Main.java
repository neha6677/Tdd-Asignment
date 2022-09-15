package com.yash.tddAssignment.string.asgm2;

public class Main {

	public static void main(String[] args) {
		
		 
					
	}

	public static String set() {
		Member m = new Member();
		m.setFirstName("Pankaj");
		m.setLastName("Sharma");
		m.setEmail("sharma.pankaj@yash.com");
		m.setPassword("12345");
		m.setRole("Trainer");
		return m.showMemberDetail();
		
		
	}

}
