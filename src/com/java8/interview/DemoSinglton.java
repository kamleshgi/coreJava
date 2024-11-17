package com.java8.interview;

public class DemoSinglton {

	public static void main(String[] args) {
		SingletonWithLazyLoading singletonWithLazyLoading1=SingletonWithLazyLoading.getInstance();
		SingletonWithLazyLoading SingletonWithLazyLoading2=SingletonWithLazyLoading.getInstance();
		if (singletonWithLazyLoading1 == SingletonWithLazyLoading2 ){
			System.out.println("Both Object are the Same instance");
			
		}
	}

}
