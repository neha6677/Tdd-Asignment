package com.yash.tddAssignment.basics;

public class ConsecutiveNumber {
	
	public static void main(String[] args) {
		
	}
	public int consecutiveNumsSum(int n)
    {
       int sum=0;
       for(int i=1;i<=n;i++)
       {
        sum=sum+i;
       }
       return sum;
        }  

}
