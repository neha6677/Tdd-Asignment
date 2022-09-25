package com.yash.tddAssignment.advance;

import java.util.Arrays;
import java.util.Scanner;






public class App 
{
    public static void main( String[] args )
    {
        
        ApplicationServices aps=new ApplicationServices();
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
        	
        System.out.println("Enter 1 to add");	
        System.out.println("Enter 2 to update");	
        System.out.println("Enter 3 to vi");	
        System.out.println("Enter 4 to add");	
        System.out.println("Enter 5 to add");	
        System.out.println("Enter 6 to add");	
        System.out.println("Enter 7 to add");	
        
        
       
       
        System.out.println("Enter Your Choice : ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			
        System.out.println("-----------Application Add Operation-------------");
		System.out.println("Enter Application Id : ");
		int appId = sc.nextInt();
		System.out.println("Enter Application Name : ");
		String appname = sc.next();
		Application app=new Application(appId,appname);
		aps.addApplication(app);
		System.out.println(app);
			 
		
		
		
		break;
		case 2:
			System.out.println("-----------Application UPDATE OPERATION-------------");
			System.out.println("Enter Application Id : ");
			int upid = sc.nextInt();
			System.out.println("Enter Application Name : ");
			String uname = sc.next();
			Application app1=new Application(upid,uname);
			
			app1 = aps.updateApplication(upid, app1);			
					
			System.out.println(app1);
			break;
		case 3:
			System.out.println("-----------PRODUCT DELETE OPERATION-------------");
			System.out.println("Enter Application ID : ");
			int apid = sc.nextInt();
		   aps.deleteApplication(apid);
			
						break;
		case 4:
			System.out.println("-----------PRODUCT SHOW ALL OPERATION-------------");
			System.out.println(Arrays.toString(aps.listApplications()));
			break;
			
		case 5:
			 System.out.println("-----------ApplicationNew Add Operation-------------");
				System.out.println("Enter new Application Id : ");
				int appIdn = sc.nextInt();
				System.out.println("Enter new Application Name : ");
				String appnamen = sc.next();
				System.out.println("Enter new Application Date : ");
				String appdaten = sc.next();
				ApplicationNew appn=new ApplicationNew(appIdn,appnamen,appdaten);
				
				aps.addApplicationNew(appn);
				System.out.println(appn);
			  break;
			  
		case 6:
			System.out.println("-----------Application SEARCH BY Date OPERATION-------------");
			
			System.out.println("Enter Application date : ");
			String date1 = sc.next();
			System.out.println("Enter another Application date : ");
			String date2 = sc.next();
			ApplicationNew Appd[] = aps.searchByDate(date1, date2);
					
			System.out.println(Arrays.toString(Appd));
			break;
		case 7:
System.out.println("-----------Application SEARCH BY Date or name OPERATION-------------");
			
			System.out.println("Enter to which you want search either by for date press 1  or name press 2: ");
			int value=sc.nextInt();
			if(value==1) {
				System.out.println("Enter Application date : ");
			String date = sc.next();
			ApplicationNew Appnd[] = aps.searchByDate(date);
			System.out.println(Arrays.toString(Appnd));
			}else {
												
			System.out.println("Enter Application name : ");
			String name = sc.next();
						ApplicationNew Appn[] = aps.searchByName(name);
					
			System.out.println(Arrays.toString(Appn));
			}
			break;
		default:
			System.out.println("Invalid Choice..!");
			break;
		}
		System.out.println("for exit press 0 and continue with given option");
		int n =sc.nextInt();
		if(n==0)
		{
			System.exit(0);
		}else {
			continue;
		}
		}
			
        }
		}
    

