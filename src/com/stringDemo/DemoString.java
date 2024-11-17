package com.stringDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoString {

	public static void main(String[] args) {
	String sName="Kamlesh";
	
	//StringBuilder ss=new StringBuilder(sName);
//	ss=ss.reverse();
//	System.out.println(ss);
//	 aaa = Stream.of("Aniruddh".split("")).reduce("", (reversed, character) -> character + reversed);
	
	
	  char[] charName= sName.toCharArray();
	 List<char[]> list = Arrays.asList(charName);
	 
	 
	 List<String> rev = list.stream().map(s->new StringBuilder().reverse().toString())
	 .collect(Collectors.toList());
	 
	 System.out.println("Revers: "+rev);
	}

}
