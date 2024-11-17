package com.java8.coding;

import java.util.Arrays;
import java.util.List;

public class CharacterCounter {

	public static void main(String[] args) {
		char targetChar = 'a';
		List<String> strings = Arrays.asList("apple", "banana", "cherry");
		long occurrences = strings.stream().flatMapToInt(CharSequence::chars).filter(ch -> ch == targetChar).count();

		System.out.println("Occurrences of '" + targetChar + "': " + occurrences);
	}

}
