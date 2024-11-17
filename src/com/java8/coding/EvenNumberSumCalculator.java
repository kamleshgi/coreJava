package com.java8.coding;

import java.util.Arrays;
import java.util.List;

public class EvenNumberSumCalculator {
//Question 5: Write a Java 8 program to find the sum of all even numbers in a list of integers ?
	public static void main(String[] args) {
		
		List<Integer> number=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
		
	int evenSum	=number.stream().filter(n->n%2==0).mapToInt(n->n).sum();
		
		System.out.println("Sum of even numbers: "+evenSum);

	}

}
