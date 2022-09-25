package com.yash.tddAssignment.intermed.asgm1;

public class StringMultipleMethods {
	
public static String concateString() {
		
		String s1="Neha";  
		String s2="Thakur";  
		String s=s1.concat(s2);
		return s;
	}
	
	public static char charAt() {
		
		String name="England";  
		char ch=name.charAt(4);
		return ch;
	}
	public static boolean containsString() {
		
		String name="USA";  
		boolean ch=name.contains("A");
		return ch;
	}
	
	

	public static void main(String[] args) {
		StringMultipleMethods.charAt();
		

	}

}

