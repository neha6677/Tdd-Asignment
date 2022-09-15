package com.yash.tddAssignment.string.asgm1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tddAssignment.string.asgm1.Document;

	public class StringDocumentTest {
		Document d = new Document();
	
	@Test
	public void ShouldReturn_String_through_method() {
		String show = d.getTitle();
		assertEquals(show, "java basics");
	}

}
