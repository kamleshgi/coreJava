package com.java8.StreamOnString;

import java.io.InputStream;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamOnString {

	public static void main(String[] args) {
		String input="hello hello";
		//count the vowel in a given String
		long vowelsCout = input.chars().filter((x)->{
			return(x=='a'||x=='e'||x=='i'||x=='o'||x=='u');
		}).count();
  System.out.println(vowelsCout);
  
  //count the all Charectore to given String
  Map<String, Long> out = input.chars().mapToObj(x->(char)x)
  .collect(Collectors.groupingBy(Object::toString,Collectors.counting()));
  
  out.forEach((key,value)->System.out.println(key+":"+value));
	}


}
