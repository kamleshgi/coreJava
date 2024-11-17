package com.array.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArrayMultiplicationUsingStream {

	public static void main(String[] args) {
		Integer[] inpurArray= {1,2,3,4,5};
	   List<Integer> numberList=Arrays.asList(inpurArray);
	  Optional<Integer> output=numberList.stream().reduce((a,b)->a*b);
	   if(output.isPresent()) {
		   System.out.println("Array Multiplication using java 8 : "+output.get());		   
	   }
	   else {
		   System.out.println("Empty Array/List");
	   }
	   Integer forrachout=1;
	   for (Integer number : numberList) {
		forrachout*=number;
	}
	 System.out.println(forrachout);  
	}
	

}
