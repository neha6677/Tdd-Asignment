package com.yash.tddAssignment.intermed.asgm1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringMultipleMethodsTest {

	public class StringMethodsTest {
		
		StringMultipleMethods sm = new StringMultipleMethods();
		
		@Test
		public void test_GivenString_ShouldReturn_charatgivenposition() 
		{
			
			char result=sm.charAt();
			assertEquals('a', result);
			
		}

		@Test
		public void test_GivenString_ShouldReturn_concateString() 
		{
			String con=sm.concateString();
			assertEquals("NehaThakur", con);
			
		}
		@Test
		public void test_GivenString_ShouldReturn_boolean_ifcontains() 
		{
			boolean con=sm.containsString();
			assertEquals(true, con);
			
		}
	

}
}