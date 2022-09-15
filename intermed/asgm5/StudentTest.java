package com.yash.tddAssignment.intermed.asgm5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tddAssignment.string.asgm4.Main;

public class StudentTest {

	//Student s = new Student();
	@Test
	public void test_ShouldReturn_String_AsOutput() 
	{
		 
		int count=Student.counting();
		assertEquals(count, 3);
		
	}
}
