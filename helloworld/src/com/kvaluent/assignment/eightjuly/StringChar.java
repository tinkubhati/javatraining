package com.kvaluent.assignment.eightjuly;

import java.util.Scanner;

public class StringChar {

	public static void main(String[] args) {
		
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i = 0; i<str.length(); i++) {
			char chr=str.charAt(i);
			
			int asciValue = chr;
			System.out.println("ASCII value of " +chr+" is: " +asciValue);
		}
		
	}

}
