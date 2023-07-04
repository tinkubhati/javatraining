package com.prodapt.assignment;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		int m,n,x,y;


		System.out.println("Enter dimensions of Matricx 1");
		Scanner ab = new Scanner(System.in);
		m=ab.nextInt();
		n=ab.nextInt();
		
		System.out.println("Enter dimensions of Matricx 2");
		x=ab.nextInt();
		y=ab.nextInt();
		
		if((m==x)&&(n==y)) {
		
		int arr1[][]=new int [m][n];
		for(int row = 0; row<m;row++) {
			for(int column = 0; column <n; column++) {
				System.out.println("Enter Elements in Matrix 1");

				arr1[row][column] =ab.nextInt();

			}

		}

		int arr2[][]=new int [m][n];

		for(int row = 0; row<x;row++) {
			for(int column = 0; column < y; column++) {

				System.out.println("Enter Elements in Matrix 2");


				arr2[row][column] =ab.nextInt();
			
			}
		}
		ab.close();
		int arr3 [][] = new int [m][n] ;
		 {
			for(int row = 0; row<x;row++) {
				for(int column = 0; column < y; column++) {

					arr3 [row][column] =(arr1[row][column]+arr2[row][column]);

					System.out.println(arr3[row][column] );
				}
			}
		}
		}

		else
			System.out.println("Dimensions of the Two Matrices didn't match");
	    }

    }

  

 
