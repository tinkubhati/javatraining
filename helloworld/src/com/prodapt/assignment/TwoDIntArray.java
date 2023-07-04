package com.prodapt.assignment;

public class TwoDIntArray {

	public static void main(String[] args) {

		//rows and columns
		int m=3,n=3;
		int arr[][]=new int [m][n];

		for(int row = 0; row<arr.length;row++) {
			for(int column = 0; column < arr.length; column++) {

				arr[row][column] = row+1;
			}
		}

		for(int row = 0; row<arr.length;row++) {
			for(int column = 0; column < arr.length; column++) {

				if(arr[row][column] % 2!= 0) {

					System.out.println(arr[row][column]);
				}
			}
		}


	}
}
