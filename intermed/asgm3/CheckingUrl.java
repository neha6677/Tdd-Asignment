package com.yash.tddAssignment.intermed.asgm3;

public class CheckingUrl {
    
	public static void main(String args[])
    {      
		CheckingUrl.displayUrlactionone();
		CheckingUrl.displayUrlactiontwo();
		CheckingUrl.displayUrlactionthree();
		
		}


	public static String displayUrlactionone() {
		String url="www.yash.com/index.jsp";
		 String fileNameWithoutExtension1 = url.substring(url.lastIndexOf('/')+1, url.lastIndexOf('.'));
			 System.out.println(fileNameWithoutExtension1);
		return fileNameWithoutExtension1;
	}
	public static String displayUrlactiontwo() {
		String url="www.yash.com/employees/salary.xhtml";
		 String fileNameWithoutExtension2 = url.substring(url.lastIndexOf('/')+1, url.lastIndexOf('.'));
			 System.out.println(fileNameWithoutExtension2);
		return fileNameWithoutExtension2;
	}
	public static String displayUrlactionthree() {
		 String url="www.google.com/searches/searchdata.jsp";
		 String fileNameWithoutExtension3 = url.substring(url.lastIndexOf('/')+1, url.lastIndexOf('.'));
			 System.out.println(fileNameWithoutExtension3);
		return fileNameWithoutExtension3;
	}
	
  
             
    
}