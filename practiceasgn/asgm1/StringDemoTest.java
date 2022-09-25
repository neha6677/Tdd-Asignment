package com.yash.tddAssignment.practiceasgn.asgm1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tddAssignment.practiceAsign.asgm1.Main;




public class StringDemoTest {
	
	Main m = new Main();
	
	@Test
	public void test_ShouldReturn_String_AsOutput() 
	{
		 
		String result=m.setinput();
		assertEquals(result, "StringDemo [input=Java Test]");
		
	}

}
