package com.java8.fibonacciseries;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciSeries {
//like 0, 1, 1, 2, 3, 5, 8, 13, 21  
	public static void main(String[] args) {
		
	List<Integer> fiboncciSeriesList = 
		Stream.iterate(new int[] {0,1}, 
				s->new int[] {s[1],s[0]+s[1]})
		.limit(10)
		.map(n->n[0])
		.collect(Collectors.toList());
	System.out.print(fiboncciSeriesList);
	}

}
