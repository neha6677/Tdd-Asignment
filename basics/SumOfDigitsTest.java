package com.yash.tddAssignment.basics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumOfDigitsTest {

	@Test
	public void test_GivenNum_ShouldReturn_Sum() 
	{
		SumOfDigits sd = new SumOfDigits();
		int result=sd.digitSum();
		assertEquals(12, result);
		
	}
}
