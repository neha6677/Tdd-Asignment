package com.yash.tddAssignment.string.asgm1;

public class Main {
	String showDocumentInformation(String title,String filepath) {
		//System.out.println(this.getTitle()+ " "+ this.getFilepath());
		return title + " , " + filepath;
		
	}
	
	public static void main(String[] args) {
		Document d = new Document();
		d.setTitle("java basics");
		d.setFilepath("c:/document/corejava/basics/introduction.pdf");
		System.out.println(d.showDocumentInformation());
		
	}

}
