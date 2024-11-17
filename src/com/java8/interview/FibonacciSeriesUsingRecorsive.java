package com.java8.interview;

public class FibonacciSeriesUsingRecorsive {
	
	public static void main(String args[]) {
		//given Number N
		int N=10;
		
		//Print the First N Number
		for(int i=0;i<N;i++) {
			System.out.println(fib(i)+" ");
			
		}
	}

	//Function to print the Fibonacci Series
	private static int fib(int n) {
		if(n <= 1)
			return n;
		
		//Reccursive
		return fib(n-1)+fib(n-2);
	}

}
 //out put
//0 
//1 
//1 
//2 
//3 
//5 
//8 
//13 
//21 
//34 
