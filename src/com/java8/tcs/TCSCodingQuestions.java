package com.java8.tcs;

public class TCSCodingQuestions {
public static void main(String[] args) {
	//1. Print a pattern with 1 star in one line
	//   and 2 star in 2nd line
	//   and so on upto 5 rows.
	printTrangle(7);
	
	
	
	//2. Write a program to find a number is 
	// even/odd number without using Modulus operator.
	
	int inputNumber=8;
	int quetient=inputNumber/2;
	if(quetient*2==inputNumber) {
		System.out.println("Even Number");
		
	}else {
		System.out.println("Odd Number");
	}
	//Approch 2 using bit operator
	
	if((inputNumber & 1)==0) {
		System.out.println("Even Number");	
	}else {
		System.out.println("Odd Numebr");
	}	
}

public static void printTrangle(int inputNumber) {
	//outerLoop to handle row
	 for(int i=0; i<inputNumber; i++) {
		 //to handle space
		 for(int j=inputNumber-i; j>1; j--) {
			 System.out.print(" ");
		 }
		 // print the *
		 for(int j=0; j<=i; j++) {
			 System.out.print("* ");
		 }
		 
		 System.out.println();
	 }
	
	
}

}
