package com.java8.UST;

public class MainClass {
 
	public static void main(String[] args) {
		UserInterFace uif=()->{
			System.out.println("From func interface");
		};
		
		uif.display();
	}
	
}
