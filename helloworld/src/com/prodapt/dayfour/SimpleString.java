package com.prodapt.dayfour;

public class SimpleString {

	public static void main(String[] args) {
		// Simple String Operations
		char c[] = {'J', 'a', 'v', 'a'};
		String s1 = new String(c); // String constructor using
		String s2 = new String(s1);
		// String constructor using string as arg.
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Length of String s2 : " + s2.length());
		System.out.println("Index of v : " + s2.indexOf('v'));
		System.out.println("s2 in uppercase : " + s2.toUpperCase());
		System.out.println("Character at position 2 is : " + s2.charAt(1));
		// Using concatenation to prevent long lines.
		String longStr = "This could have been " +
		"a very long line that would have " +
		"wrapped around. But string concatenation " +
		"prevents this.";
		System.out.println(longStr);

	}

}
