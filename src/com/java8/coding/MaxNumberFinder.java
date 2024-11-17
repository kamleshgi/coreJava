package com.java8.coding;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//Question 3: Write a Java 8 program to find the maximum element from a list ?

public class MaxNumberFinder {
	
  public static void main(String args[]) {
	  List<Integer> newNumber=List.of(30,40,50,6,7,8);
	Optional<Integer> num=	newNumber.stream().max(Integer::compareTo);
		
	int maxnumber=num.orElse(Integer.MAX_VALUE);
	System.out.println(maxnumber);
	
//	=========================================
Optional<Integer> nu=	newNumber.stream()
                        .collect(Collectors.maxBy(Comparator.naturalOrder()));
	
  System.out.println(nu.get());
  }
   
}
