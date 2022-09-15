package com.yash.tddAssignment.basics;

public class Divisibility {

	int sum=0;
	
	public long add() {
for (int i = 100; i <=200 ; i++) {
			
			if(i%7==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
}