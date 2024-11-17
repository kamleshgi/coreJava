package com.java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AverageStringLengthCalculator {

//	Question 7: Write a Java 8 program to find the average length of strings in a list of strings?
	
	public static void main(String[] args) {
		
   List<String> strings=Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
   
OptionalDouble s=   strings.stream().mapToInt(String::length).average();
System.out.println(s);
	}

}
