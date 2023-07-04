package com.prodapt.daythree;

public class TwoDArray {

	public static void main(String[] args) {
		int rows = 3;
		int columns = 3;
		int arr2D[][]= new int [3][3];
		System.out.println(arr2D.length);
		
		System.out.println("*******************************************************************");
		
		for(int row = 0; row<arr2D.length;row++) {
			for(int column = 0; column < arr2D.length; column++) {
				
				arr2D[row][column] = row+1;
			}
			
		}
		
		for(int row =0; row< arr2D.length;row++) {
			for(int column = 0; column < arr2D.length; column++) {
				
				System.out.println(arr2D[row][column]);
			}
		}

	}

}
