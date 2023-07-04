package com.prodapt.assignment;

import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) {
		int arr[]= new int [10];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter Values in Array ");
			Scanner sc = new Scanner(System.in);
			arr[i]=sc.nextInt();
			sc.close();
			
		}
		for(int j=0;j<arr.length;j++) {
			
			if(arr[j]%2 == 0) {
				System.out.println(arr[j]);
			}
			
		}
		

	}
	

}
