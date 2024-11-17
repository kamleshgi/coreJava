package com.java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberChecker {
//	Question 4: Write a Java 8 program to check if a list contains a specific element ?
	public static void main(String[] args) {
		List<Integer> numbetList=Arrays.asList(1,2,3,4,5,6);
		
	boolean find=	numbetList.stream().anyMatch(n->n==4);
	
	System.out.println("Find Nuber 4 is : "+find);
	
//	List<String> name=Arrays.asList("Kamlesh");
//	
//Boolean findLatter=	name.stream().findAny().equals("K");
//System.out.println("Find Charector K is : "+findLatter);
	}

}
