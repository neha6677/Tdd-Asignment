package com.yash.tddAssignment.basics;

public class CountingEvenOdd {
	static int getResult()
	{
		int num=123456;
		int odd=0,even=0;
	    while(num!=0)
	    {
	        int rem=num%10;
	        if(rem%2==1)
	            odd++;
	        else
	            even++;
	        num/=10;
	    }
	    System.out.println(odd + " odd count");
	    System.out.println(even + " even count");
	    return odd+even;
	}
		
	     
	    
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountingEvenOdd.getResult();
		
		

	}


}
