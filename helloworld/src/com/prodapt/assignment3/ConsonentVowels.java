package com.prodapt.assignment3;

import java.util.Scanner;

public class ConsonentVowels {

	public static void main(String[] args) {
		int v=0,c=0;
		String str;
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in); 
		str = sc.next();
		int len = str.length();
		str = str.toLowerCase();
		sc.close();
		for( int i=0;i<len;i++) {
			
			if((str.charAt(i) == 'a')||(str.charAt(i) == 'e')||(str.charAt(i) == 'i')||(str.charAt(i) == 'o')||(str.charAt(i) == 'u')) {
				v++;
			}
			else if((str.charAt(i) >= 'a')||(str.charAt(i) <= 'z')){
				c++;
			}
		}
		
		System.out.println("Number of Vowels : " + v);
		System.out.println("Number of Consonents : " + c);

	}

}
