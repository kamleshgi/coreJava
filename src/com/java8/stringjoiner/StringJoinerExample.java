package com.java8.stringjoiner;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringJoinerExample {

	public static void main(String[] args) {
		String input="Hello How are you";
		       String[] inputArray = input.split(" ");
		       StringJoiner joiner=new StringJoiner("-","[","]");
		       
		       for (String inputArr : inputArray) {
				joiner.add(inputArr);
			}	       
		       System.out.println(joiner.toString());
		       
		       List<String> arayList = Arrays.asList("Hello","How","are","you");
	           String stringEx = arayList.stream().collect(Collectors.joining("-"));
	          System.out.println(stringEx);
	}

}
