package com.duplicateUsinfStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class interviewTest {
//1.1 In Java 8, we can use Stream.iterate to generate Fibonacci numbers like this :
	
	public static void main(String[] args) {
//		int count =10;
//	Integer[] numbers= {1,2,3,4,5,6};
//	  List<Integer> list= Arrays.asList(numbers);
//	  
//	 List<Integer> listarr = list.stream().collect(Collectors.toList());
//	 listarr.forEach(l->System.out.print(l));
//	 //febonacci Series
		
	/*	Stream.iterate(new int[] {0,1}, t->new int[] {
				t[1], t[0] + t[1]}
		).limit(10).forEach(x->System.out.println("{"+x[0]+","+x[1]+"}"));
		*/
		
		//fibonacci Series
		
	 Stream.iterate(new int[] {0,1}, t->new int[] {t[1],t[0]+t[1]}).limit(10)
	 
	    .map(n->n[0]).collect(Collectors.toList())
	    .forEach(x->System.out.println(x));
	 
	}

}
