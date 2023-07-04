package com.prodapt.assignment3;
import java.util.Scanner;

public class PrintInitials {

	public static void main(String[] args) {
		String str;
		int len;
		System.out.println("Enter The Strng : ");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		len = str.length();
		sc.close();
		
		if( len == 0) {
		System.out.println("No Name Entered!!  Please Enter A Name");
		}
		 
			System.out.println(Character.toUpperCase(str.charAt(0)));
		
		for(int i=0; i<len-1 ;i++) {
			if(str.charAt(i) == ' ') {
				System.out.println(' '+ Character.toUpperCase(str.charAt(i+1)));
			}
			
		}
		

	}


}
