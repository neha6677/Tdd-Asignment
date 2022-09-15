package com.yash.tddAssignment.basics;

import java.util.Arrays;
import java.util.List;

public class SumOfDigits {

	public int digitSum() {
		List<Integer> integers = Arrays.asList(1, 3, 1, 2, 5);
		Integer sum = integers.stream()
				  .mapToInt(Integer::intValue)
				  .sum();
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
