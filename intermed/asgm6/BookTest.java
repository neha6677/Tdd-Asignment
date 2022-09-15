package com.yash.tddAssignment.intermed.asgm6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BookTest {
	
	
	@Test
	public void test_noOfBooks_AsOutput()
	{
		 
		int count=Book.bookswritten();
		assertEquals(count, 2);
		
	}

}

