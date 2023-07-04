package com.kvaluent.assignment.eightjuly;

public class RandomGenerator {
	
	public static void main(String[] args) {	


	int min = 1;
	int max = 5;

	System.out.println("Random value of type double between " + min + " to " + max + ":");
	double a = Math.random() * (max - min + 1) + min;
		System.out.println(a);
		
		
	}
	
}