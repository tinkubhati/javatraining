package com.prodapt.assignment3;

import java.util.Scanner;

public class StringIntMain {

	public static void main(String[] args) {
	  
		System.out.println("Enter The String : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int len = str.length();
		int char_count = 0;
		 int digit_count = 0;
		 sc.close();
		 
		 for(int i=0;i<len;i++) 
		 		{	 if((str.charAt(i) >= 48) && (str.charAt(i) <=57)) {
				 
		 					digit_count++;
		 				}
			 else {
				 char_count++;
			 			}
			 
		 		}
		   if(digit_count == len) {
			   System.out.println("It Contains INTEGER Only");
		   }
		   else if(char_count == len) {
			   System.out.println("It Contains STRING Only");
		   }
		   else {
			   System.out.println("It Contains String as well");
		   }
		}
	 }



//if(count == 0) {
//System.out.println("It Contains String Only");
//
//}



//(str.charAt(i)>0 || str.charAt(i) <9)&&
//str.matches("^[a-zA-Z]")