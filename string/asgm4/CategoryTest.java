package com.yash.tddAssignment.string.asgm4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tddAssignment.string.asgm4.Main;

public class CategoryTest {
	
	Main m = new Main();
	//Member m = new Member();
	@Test
	public void test_ShouldReturn_String_AsOutput() 
	{
		 
		String result=m.settingDetails();
		assertEquals(result, "Category [id=101, name=javabasics, createdDate=31-01-2017]");
		
	}

}
