package com.java8.secondhighest;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumber {

	public static void main(String[] args) {
		Integer arr[]= {12,16,45,11,18,22,19,20,45};
		
		Integer result = Arrays.asList(arr)
						.stream().distinct()
						.sorted(Comparator.reverseOrder())
						.skip(1)
						.findFirst()
						.get();
						
		System.out.println("Second Highest Number"+result);

	}

}
