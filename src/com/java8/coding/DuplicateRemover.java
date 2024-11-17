package com.java8.coding;

import java.util.List;
import java.util.stream.Collectors;

public class DuplicateRemover {
//	Question 11: Write a Java 8 program to remove duplicate elements from a list ?
	public static void main(String[] args) {
		List<Integer> number=List.of(1,2,3,4,5,6,7,8,6,7,8,9,9,9,9);
	List<Integer> uniqueNumbers= number.stream().distinct().collect(Collectors.toList());
		
	System.out.println("Unique numbers: " + uniqueNumbers);

	}

}
