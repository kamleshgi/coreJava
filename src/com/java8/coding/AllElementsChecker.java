package com.java8.coding;

import java.util.List;

public class AllElementsChecker {

	public static void main(String[] args) {
		List<Integer> numbers=List.of(10,20,30,40,50);
		int threshold = 25;
	Boolean find=	numbers.stream().allMatch(n->n>threshold);
	System.out.println("Are all elements greater than " + threshold + "? " + find);

	}
}
