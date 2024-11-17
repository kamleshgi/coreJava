package com.java8.interview;

public class SingletonWithLazyLoading {

	private static SingletonWithLazyLoading instance;
	private SingletonWithLazyLoading() {}
	
	public static synchronized SingletonWithLazyLoading getInstance() {
		if(instance==null) {
			instance=new  SingletonWithLazyLoading();
		}
		
		return instance;
}
}
