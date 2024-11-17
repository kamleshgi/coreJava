package com.java8.coding;

import java.util.stream.IntStream;

public class FactorialCalculator {
//	Question 10: Write a Java 8 program to find the factorial of a given number ?

	public static void main(String[] args) {

		int number = 5;
		int factorial = IntStream.rangeClosed(1, number)
				            .reduce(1, (a, b) -> a * b);
		System.out.println("Factorial of " + number + ": " + factorial);
	}
}
