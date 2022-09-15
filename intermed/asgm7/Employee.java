package com.yash.tddAssignment.intermed.asgm7;

import com.yash.tddAssignment.intermed.asgm6.Book;

public class Employee {

	private String emp_name;
	private String emp_desig;
	private int emp_id;
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_desig() {
		return emp_desig;
	}
	public void setEmp_desig(String emp_desig) {
		this.emp_desig = emp_desig;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
	 static int noOfEmployees = 0;
	  
	    // Instead of performing increment in the constructor
	    // instance block 
	    {
	    	noOfEmployees += 1;
	    }

		
	    
	   
		public Employee(String emp_name, String emp_desig) {
			super();
			this.emp_name = emp_name;
			this.emp_desig = emp_desig;
		}
		public Employee(int emp_id) {
			super();
			this.emp_id = emp_id;
		}
		public Employee(String emp_name, String emp_desig, int emp_id) {
			super();
			this.emp_name = emp_name;
			this.emp_desig = emp_desig;
			this.emp_id = emp_id;
		}
		public static void main(String[] args) {
	    	
			
			  
			  
			System.out.println("number of Student Registered are" +Employee.noOfEmployees);
		}
		
		public static int numberOfEmployees() {
			Employee e1 = new Employee(101);
			  Employee e2 = new Employee("Neha Thakur", "Software Developer");
			  Employee e3 = new Employee("Neelu", "Teacher", 121);
			return Employee.noOfEmployees;
			
		}
	

}

