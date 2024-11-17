package com.java8.interview;

import java.util.Iterator;

public class HCL {
	
	//1.Wirte a programm with recurssive Fibonacciseries
	//2.write a program Sigaltone Class
	//3.what is final
	//whte is Overloding
	//what is overrriding
	//what is Pollymorphisam
	//what is Synchronization
	//what is Final,Finally,Finalize
	//Whate is HashMap and HashTable diffrence
	//whate is Stack
	

	public static void main(String[] args) {
		//0,1,1,2,3,5,8	
		int number=10;
		
		fabonacci(number);
		
	}

	private static void fabonacci(int number) {
		int num1=0,num2=1;
		for (int i = 0; i <number; i++) {
			System.out.print(num1+" ");
			
			//Swap
			int num3=num2+num1;
				num1=num2;
				num2=num3;	
		}
	}
	
	
}
