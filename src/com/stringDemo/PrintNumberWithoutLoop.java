package com.stringDemo;

import java.util.stream.IntStream;

public class PrintNumberWithoutLoop {

	public static void main(String[] args) {
		// Use IntStream.rangeClosed to generate a sequence of numbers from 1 to 100
        IntStream numbers = IntStream.rangeClosed(1, 100);

        // Use forEach to print each number in the sequence
        numbers.forEach(System.out::println);
      
	}

}
