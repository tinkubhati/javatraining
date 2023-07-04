package com.prodapt.assignment3;

import java.util.Scanner;

public class Concat {

	public static void main(String[] args) {
		String str1,str2;
		System.out.println("ENTER THE STRINGS ");
		Scanner sc= new Scanner(System.in);
		str1 = sc.next();
		str2 = sc.next();
		sc.close();
		str1 = str1.concat(str2);
		System.out.println(str1);
//		String str = str.concat(str2)

	}

}
