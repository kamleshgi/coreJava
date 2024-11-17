package com.duplicateUsinfStream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateUseingStreams {

	public static void main(String[] args) {
	Integer[] inputNumber= {5,3,4,1,3,7,2,9,9,3};
	
	List<Integer> numList=Arrays.asList(inputNumber);
	
	Map<Integer, Long> output = numList.stream()
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	output.forEach((Key,value)->{
		System.out.println(Key+" "+value);
	});
	
	String[] stringArray= {"Aman","Aman","Kamal","Kamal"};
	
	List<String> inputStringList=Arrays.asList(stringArray);
	
	Map<String, Long> outputStringCount = inputStringList.stream()
	    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	outputStringCount.forEach((Key,value)->{System.out.println(Key+ " "+value);});
	
	}

}
