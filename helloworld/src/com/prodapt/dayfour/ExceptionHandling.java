package com.prodapt.dayfour;

public class ExceptionHandling {

	public static void main(String[] args) {
		divide(10,0);
		divide(10,7);
	}
	
	public static void divide(int x, int y) {
		int ans;
		try {
			ans=x/y;
			System.out.println(ans);
		}catch(ArithmeticException e) {
			System.out.println("You are dividing a number by Zero" + e.getMessage());
		}
		finally {
			System.out.println("I am finally");
		}
		
		
		
	}

}
