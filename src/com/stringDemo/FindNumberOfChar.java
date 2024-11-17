package com.stringDemo;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNumberOfChar {

	public static void main(String[] args) {
		String input="SubscribetoinTerviewmania";
//	Map<String,Long> result =input.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
//		                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	Map<String, Long> charCount = input.codePoints().mapToObj(Character::toString)
	                              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	System.out.println(charCount);
		
		

	}

}
