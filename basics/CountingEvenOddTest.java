package com.yash.tddAssignment.basics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountingEvenOddTest {

	@Test
	public void test_GivenNum_ShouldReturn_Multiplication() 
	{
		
		int result=CountingEvenOdd.getResult();
		assertEquals(6, result);
		
	}
}
