package com.java8.coding;

import java.util.List;
import java.util.Optional;

public class LongestStringFinder {
//Question 12: Write a Java 8 program to find the longest string in a list of strings ?
	public static void main(String[] args) {
		List<String> strings=List.of("apple", "banana", "cherry", "grapefruit");
	Optional<String> longestString=	strings.stream().max((s1,s2)->s1.length()-s2.length());
	 System.out.println("Longest string: " + longestString.get());
	}

}
