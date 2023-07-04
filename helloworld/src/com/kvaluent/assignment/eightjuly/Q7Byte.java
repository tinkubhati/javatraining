package com.kvaluent.assignment.eightjuly;

import java.util.Scanner;

public class Q7Byte {
	static byte a;
	static byte b;

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		a=sc.nextByte();
		b=sc.nextByte();
		byte b3 = (byte) (a+b);
		System.out.println(b3);

	}

}
