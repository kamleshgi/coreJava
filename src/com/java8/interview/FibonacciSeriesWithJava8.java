package com.java8.interview;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciSeriesWithJava8 {

	public static void main(String args[]) {
		List<Integer> fibonacciSeries = Stream.iterate(new int[] { 0, 1 }, s -> new int[] { s[1], s[0] + s[1] })
				.limit(10).map(n -> n[0]).collect(Collectors.toList());
		System.out.println(fibonacciSeries);
	}
}
