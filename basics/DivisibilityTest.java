package com.yash.tddAssignment.basics;

import static org.junit.Assert.assertEquals;

public class DivisibilityTest {

	Divisibility d=new Divisibility();
	@org.junit.Test
	public void test_DivisibleBy7_Right() {
		assertEquals(d.add(), 2107);
	}
	
	/*
	 * @org.junit.Test public void test_DivisibleBy7_Wrong() { assertEquals(d.add(),
	 * 500); }
	 */
}

