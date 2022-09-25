package com.yash.tddAssignment.advance;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tddAssignment.intermed.asgm6.Book;

public class ApplicationTest {
	ApplicationServices as = new ApplicationServices();

	@Test
	public void test_addapplication_asObject() {
		Application app = new Application(101, "aaaa");
		String app1 = as.addApplication(app) + "Application Successfully added...";
		assertEquals(app1, app.toString() + "Application Successfully added...");

	}

	@Test
	public void test_updateapplication_asObject() {
		Application app = new Application(101, "bbb");
		String app2 = as.updateApplication(app.getId(), app) + "Application Successfully Updated..!";
		assertEquals(app2, app.toString() + "Application Successfully Updated..!");

	}

	@Test
	public void test_deleteapplication_asObject() {
		Application app = new Application(101, "bbb");
		boolean deleteApplication = as.deleteApplication(101);
		assertEquals(deleteApplication, true);

	}

	@Test
	public void test_ObjectaddedInlist_asArrayObject() {
		Application[] app = new Application[0];
		// app[0]= new Application(101, "aaa");
		// app[1]= new Application(102, "bbb");

		Application[] list = as.listApplications();
		// list[0]=new Application(101, "aaa");

		assertEquals(list, app);

	}

	/*
	 * @Test public void test_changeapplication_asObject() { ApplicationNew app =
	 * new ApplicationNew(1, "NEHA", "12/12/2020"); String app1 =
	 * as.addApplicationNew(app) + "Application Successfully added...";
	 * assertEquals(app1, app + "Application Successfully added...");
	 * 
	 * }
	 */
}