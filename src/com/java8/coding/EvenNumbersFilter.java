package com.java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Question 1: Write a Java 8 program to filter even numbers from a list ?
public class EvenNumbersFilter {

	public static void main(String[] args) {
		List<Integer> numbers= Arrays.asList(1,2,3,4,5);
		List<Integer> evenNumbers=   filterEvenNumbers(numbers);
		System.out.println("Even Numbers: "+evenNumbers);
	}

	private static List<Integer> filterEvenNumbers(List<Integer> numbers) {
		
	return numbers.stream()
				  .filter(n->n%2==0)
				  .collect(Collectors.toList());
	}

}
