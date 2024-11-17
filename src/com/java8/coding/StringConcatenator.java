package com.java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringConcatenator {
///Question 6: Write a Java 8 program to concatenate all strings in a list ?
	
	public static void main(String[] args) {
		
		List<String> strings=Arrays.asList("Hello"," ","World"," !");
		
	String fullSentance=	strings.stream().collect(Collectors.joining());
	System.out.println("Concatenated string: "+fullSentance);
	
	}

}
