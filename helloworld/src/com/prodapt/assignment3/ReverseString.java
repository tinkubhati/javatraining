package com.prodapt.assignment3;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str;
		
		System.out.println("Enter the String : ");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		sc.close();
		int len = str.length();
		StringBuilder strBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();

        for (int i = len - 1; i >= 0; i--) {
            strBuilder.append(strChars[i]);
        }

        System.out.println(strBuilder.toString()); 
    }
}

