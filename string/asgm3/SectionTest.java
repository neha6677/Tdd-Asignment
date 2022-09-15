package com.yash.tddAssignment.string.asgm3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tddAssignment.string.asgm3.Main;

public class SectionTest {
	Main m = new Main();
	//Member m = new Member();
	@Test
	public void test_ShouldReturn_String_AsOutput() 
	{
		 
		String result=m.setDetails();
		assertEquals(result, "Section [id=101, name=core_jave, createdDate=31-01-2017]");
		
	}

}
