package com.prodapt.assignment.arthmtic.calcultor;

import java.util.Scanner;

public  class Expression_Evaluator {
	public static void main(String[] args){

      
		Arithmetic ar;		
		Addition a=new Addition();
		Substraction s=new Substraction();
		Multiplication m=new Multiplication();
		Division d=new Division();
		Scanner sc=new Scanner(System.in);
	    Integer num,num2;
		System.out.println("Enter the number");
		num=sc.nextInt();
		System.out.println("Enter the second number");
		num2=sc.nextInt();
		sc.close();
		a.Calculate(num,num2);
		s.Calculate(num, num2);
		m.Calculate(num, num2);
		d.Calculate(num, num2);
		
		}
		
	}