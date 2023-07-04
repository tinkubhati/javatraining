package com.prodapt.calculator.arithmetic;

import java.util.Scanner;
import com.prodapt.calculator.arithmetic.*;

public class CalcMain {

	public static void main(String[] args) {
//		System.out.println("Enter the operands(Two numbers)");
//		Scanner t = new Scanner(System.in);
		int choice;
		
		do {
			
			System.out.println("Enter 1 for Addition \n Enter 2 for Substraction \n Enter 3 for Multiplication \n Enter 4 for Division \n Enter 5 for Modulus \n Enter 6 to Exit");
			Scanner ch = new Scanner(System.in);
			choice=ch.nextInt();
			ch.close();
				switch(choice) {
			
			case '1' :
				System.out.println("Enter Number 1 and 2");
				Scanner sc= new Scanner(System.in);
				double a=sc.nextDouble();
				double b=sc.nextDouble();
				Arithmetic add = new Add();
				break;
			
			
			
			
			
			}
		
			
		}
	
			
			
			
		
		
		
		

	}

}
