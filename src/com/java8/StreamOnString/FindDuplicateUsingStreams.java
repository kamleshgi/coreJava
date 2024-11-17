package com.java8.StreamOnString;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateUsingStreams {

	public static void main(String[] args) {
		List<Integer> numList=Arrays.asList(5,3,4,1,3,7,2,9,9,4);
		Map<Integer, Long> output = numList.stream()
		.collect(Collectors.groupingBy(
				Function.identity(),Collectors.counting()));
		
		output.forEach((Key,value)->
			System.out.println(Key+"-"+value));
		
		List<String> strList=Arrays.asList("Kamlesh","Kamlesh","Karthik","Shruti","Shruti");
		Map<String, Long> outPut2 = strList.stream()
			 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		outPut2.forEach((Key,value)->System.out.println(Key+"-"+value));
//find words start with K 
		System.out.println("======================");
		List<String> findKList = strList.stream()
				.filter(s->s.startsWith("K"))
		        .collect(Collectors.toList());
		findKList.forEach(s->System.out.println(s));
		
	}

}
