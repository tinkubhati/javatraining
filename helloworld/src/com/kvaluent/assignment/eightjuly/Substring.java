package com.kvaluent.assignment.eightjuly;
import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		
		System.out.println("Enter The String ");

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String substr = "" ;
		int start =sc.nextInt();
		int end =sc.nextInt();
		sc.close();
		
		System.out.println("The Given String is ");
		
		for (int i=start;i<end;i++) {
			
		substr =  substr + str.charAt(i) ;
		
			
		}
		
		System.out.println("The SubString is : "+ substr);
			
	

	}

}
