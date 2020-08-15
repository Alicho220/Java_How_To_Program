package com.Chapter14;

//Fig. 14.2: StringMiscellaneous.java
// This application demonstrates the length, charAt and getChars
// methods of the String class.

public class StringMiscellaneous {
	public static void main(String...args) {
		String s1 = "hello there";
		char[] charArray = new char[5];
		System.out.printf("s1: %s",s1);
		
		System.out.printf("%nLength of s1: %d",s1.length());
		s1.toUpperCase();
		System.out.printf("%n%S",s1.toUpperCase());
		
		// charAt helps to display reversed character using a loop.
		System.out.println("%nThe string reversed is: ");
		// int count = length of s1 - 1
		//while count is greater than 0
		// c-- reduce the length from behind
		for (int count = s1.length()-1; count >=0; count--)
		System.out.printf("%c ", s1.charAt(count));
		
		// copy character from string to charArray
		s1.getChars(0, 5, charArray, 0);
		System.out.printf("%nThe character array is: ");
		
		for(char character: charArray)
			System.out.print(character);
		
		
	}

}
