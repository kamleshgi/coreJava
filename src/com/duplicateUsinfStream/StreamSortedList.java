package com.duplicateUsinfStream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedList {
public static void main(String[] args) {
	List<Integer> marks=Arrays.asList(10,50,30,40,60,70);
	List<Integer> descordetList = marks.stream()
			.sorted((a,b)->b.compareTo(a))
	        .collect(Collectors.toList());
	
	System.out.println(descordetList);
	
	List<Integer> descordetList2 = marks.stream()
			.sorted(Comparator.reverseOrder())
	        .collect(Collectors.toList());
	
	System.out.println(descordetList2);
	
	
	System.out.println("Sorted the element based on the length of the ArrayList");
List<String> stringList=Arrays.asList("A","AAA","BBBBB","AAAAA");

       Comparator<String> c= (a,b)->{
        	 int l1=a.length();
        	 int l2=b.length();
        	 return Integer.compare(l2, l1);
         };
        
         
 List<String> sortedList1 = stringList.stream()
		        .sorted(c).toList();

	System.out.println(sortedList1);

	
 List<String> sortedList = stringList.stream()
		        .sorted((Comparator.comparingInt(String::length))).toList();

	System.out.println(sortedList);
	
	
}
}
