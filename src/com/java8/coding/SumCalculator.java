package com.java8.coding;

import java.util.Arrays;
import java.util.List;

public class SumCalculator {
//Question 2: Write a Java 8 program to calculate the sum of integers in a list ?
	public static void main(String[] args) {
		List<Integer> nmbers=Arrays.asList(1,2,3,5,6);
		int sumNumber=nmbers.stream().reduce(0,Integer::sum);
		System.out.println(sumNumber);
	}
}
