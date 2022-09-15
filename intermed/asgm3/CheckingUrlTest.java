package com.yash.tddAssignment.intermed.asgm3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CheckingUrlTest {
	CheckingUrl c = new CheckingUrl();
	
	@Test
	public void test_GivenUrl_ShouldReturn_index_AsOutput() 
	{
		 
		String result=c.displayUrlactionone();
		assertEquals(result, "index");
		
	}
	@Test
	public void test_GivenUrl_ShouldReturn_salary_AsOutput() 
	{
		 
		String result=c.displayUrlactiontwo();
		assertEquals(result, "salary");
		
	}
	
	@Test
	public void test_GivenUrl_ShouldReturn_searchdata_AsOutput() 
	{
		 
		String result=c.displayUrlactionthree();
		assertEquals(result, "searchdata");
		
	}


}
