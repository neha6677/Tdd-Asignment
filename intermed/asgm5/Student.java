package com.yash.tddAssignment.intermed.asgm5;

public class Student {
	private int student_id;
	private String student_name;
	private String student_class;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_class() {
		return student_class;
	}
	public void setStudent_class(String student_class) {
		this.student_class = student_class;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_class="
				+ student_class + "]";
	}
	
	 static int noOfStudentRegistered = 0;
	  
	    // Instead of performing increment in the constructor
	    // instance block 
	    {
	    	noOfStudentRegistered += 1;
	    }

		public Student(int student_id) {
			super();
			this.student_id = student_id;
		}
		public Student(int student_id, String student_name, String student_class) {
			super();
			this.student_id = student_id;
			this.student_name = student_name;
			this.student_class = student_class;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    public static void main(String[] args) {
	    	
			/*
			 * Student s1 = new Student(); Student s2 = new Student(1); Student s3 = new
			 * Student(2,"neha","12");
			 */
			//System.out.println("number of Student Registered are" +Student.noOfStudentRegistered);
		}
		public static int counting() {
			Student s1 = new Student();
			Student s2 = new Student(1);
			Student s3 = new Student(2,"neha","12");
			return Student.noOfStudentRegistered;
			
		}
	

}
