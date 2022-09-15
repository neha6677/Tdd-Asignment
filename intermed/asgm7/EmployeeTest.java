package com.yash.tddAssignment.intermed.asgm7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tddAssignment.intermed.asgm6.Book;

public class EmployeeTest {

	@Test
	public void test_noOfEmployees_AsOutput()
	{
		 
		int count=Employee.numberOfEmployees();
		assertEquals(count, 3);
		
	}
}
