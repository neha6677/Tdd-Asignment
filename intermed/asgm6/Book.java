package com.yash.tddAssignment.intermed.asgm6;

import com.yash.tddAssignment.intermed.asgm5.Student;

public class Book {
	private String book_name;
	private double book_price;
	private String book_type;
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public double getBook_price() {
		return book_price;
	}
	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}
	public String getBook_type() {
		return book_type;
	}
	public void setBook_type(String book_type) {
		this.book_type = book_type;
	}
	
	 static int noOfBookswritten = 0;
	  
	    // Instead of performing increment in the constructor
	    // instance block 
	    {
	    	noOfBookswritten += 1;
	    }

		
	    
	    public Book() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Book(String book_name) {
			super();
			this.book_name = book_name;
		}
		public static void main(String[] args) {
	    	
			/*
			 * Student s1 = new Student(); Student s2 = new Student(1); Student s3 = new
			 * Student(2,"neha","12");
			 */
			//System.out.println("number of Student Registered are" +Student.noOfStudentRegistered);
		}
		public static int bookswritten() {
			Book b1 = new Book();
			Book b2 = new Book("book1");
			return Book.noOfBookswritten;
			
		}
	

}
