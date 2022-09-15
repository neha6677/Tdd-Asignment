package com.yash.tddAssignment.basics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tddAssignment.tddCodes.FactorialOfNum;

public class FactorialTest {
	
	@Test
	public void test_Factorial_ShouldReturn_FactorialOfNumber_AsLong() 
	{
		FactorialOfNum f = new FactorialOfNum();
		long result=f.factorial();
		assertEquals(result, 720);
		
	}

}
