package com.Chapter18;

import java.security.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RandomIntStream {

	public static void main(String[] args) {
		 SecureRandom random = new SecureRandom();
		  
		 //roll a die 6,000,000 times
		 System.out.printf("%-6s%s%n", "Face", "Frequency");
		 random.ints(6000000, 1, 7)
		 	   .boxed()
		 	   .collect(Collectors.groupingBy(Function.identity(),
		 			   Collectors.counting()))
		 	   .forEach((face, frequency) ->
		 	   System.out.printf("%-6d%d%n", face, frequency));
	}

}
