package com.java8.interview;

public class Singleton {
private static final Singleton instance=new Singleton();
private Singleton() {}

public static Singleton getInstance() {
	return instance;
}
}