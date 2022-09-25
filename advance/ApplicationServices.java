package com.yash.tddAssignment.advance;

import java.util.Arrays;






public class ApplicationServices {
	
	static Application[] applications = new Application[0]; //0
	static int indexValue = 0;
	
	static ApplicationNew[] applications1 = new ApplicationNew[0]; //0
	static int indexValue1 = 0;
	
	
	
	public ApplicationNew addApplicationNew(ApplicationNew applicationnew)
	 {if(applicationnew!=null) {
		 applications1 = Arrays.copyOf(applications1, applications1.length+1);
		 applications1[indexValue++] = applicationnew;
			System.out.println("Application Successfully added...");
			return applicationnew;
		}
		System.out.println("Invalid Application so cannot be added..!");
		return null;
	 }
	 
	
	
	
	
	
	
	
	 public Application addApplication(Application application)
	 {if(application!=null) {
		 applications = Arrays.copyOf(applications, applications.length+1);
		 applications[indexValue++] = application;
			System.out.println("Application Successfully added...");
			return application;
		}
		System.out.println("Invalid Application so cannot be added..!");
		return null;
	 }
	 
	 
	 
	 public Application updateApplication(int AppId, Application newValues) {
			
			for (int i = 0; i < applications.length; i++) {
				
				Application appupdate = applications[i];
				
				if(appupdate.getId()==AppId)
				{
					appupdate.setId(newValues.getId());
					appupdate.setName(newValues.getName());
				
					System.out.println("Application Successfully Updated..!");
					return appupdate;
									}
			}
			System.out.println("Given Application Id not so cannot update...!");
			return null;
		}
	 
	 
	 public boolean deleteApplication(int appId) {
		 if(applications.length==0) {
				System.out.println("No Product for delete..!");
				
			}
		 Application [] appnew = new Application[applications.length-1];
		boolean deleted=true;	
		 int index = 0;
			for (int i=0;i<applications.length;i++) {
				Application invapplication = applications[i];
				if(invapplication.getId()==appId) {
				
					System.out.println("Product Successfully Deleted..!");
					continue;
				}
				appnew[index++] = invapplication;
			}
			applications = appnew;
			return deleted;
	
		}
	 
	 
	 
	 
	 public Application[] listApplications() {
		 //Application[] applications1 = new Application[1];
			return applications;
		}
	
	 public ApplicationNew[] searchByDate(String date1,String date2) {
		 ApplicationNew tempApplications[] = new ApplicationNew[0];
			int index = 0;
			for (ApplicationNew ApplNew : applications1) {
				
				if(ApplNew.getDate().equals(date1)&&ApplNew.getDate().equals(date2)) {
					tempApplications = Arrays.copyOf(tempApplications, tempApplications.length+1);
					tempApplications[index++] = ApplNew;
				}
			}
			if(tempApplications.length == 0) {
				System.out.println("No Application Found..!");
			}
			return tempApplications;
		}
	 

	 public ApplicationNew[] searchByDate(String date) {
		 ApplicationNew tempApplications[] = new ApplicationNew[0];
			int index = 0;
			for (ApplicationNew ApplNew : applications1) {
				
				if(ApplNew.getDate().equals(date)) {
					tempApplications = Arrays.copyOf(tempApplications, tempApplications.length+1);
					tempApplications[index++] = ApplNew;
				}
			}
			if(tempApplications.length == 0) {
				System.out.println("No Application Found..!");
			}
			return tempApplications;
		}
	 

	 public ApplicationNew[] searchByName(String name) {
		 ApplicationNew tempApplications[] = new ApplicationNew[0];
			int index = 0;
			for (ApplicationNew ApplNew : applications1) {
				
				if(ApplNew.getName().equals(name)) {
					tempApplications = Arrays.copyOf(tempApplications, tempApplications.length+1);
					tempApplications[index++] = ApplNew;
				}
			}
			if(tempApplications.length == 0) {
				System.out.println("No Application Found..!");
			}
			return tempApplications;
		}
	 
	 
	 
	 
      }
