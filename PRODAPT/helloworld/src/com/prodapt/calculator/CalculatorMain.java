package com.prodapt.calculator;
// Java program for simple calculator
  
import java.io.*;
import java.lang.Math;
import java.util.Scanner;
public class CalculatorMain {
  
    public static void main(String[] args){
    
        // stores two numbers
        double num1, num2;
  
        // Take input from the user
        Scanner sc = new Scanner(System.in);
  
        System.out.println("Enter the numbers");
  
        // take the inputs
        num1 = sc.nextDouble();
  
        num2 = sc.nextDouble();
        
  
        System.out.println("Enter the operator (+,-,*,/,%)");
  
        char op = sc.next().charAt(0);
  
        double o = 0;
        sc.close();
       
  
        switch (op) {
  
        // case to add two numbers
        case '+':
  
            o = num1 + num2;
  
            break;
  
        // case to subtract two numbers
        case '-':
  
            o = num1 - num2;
  
            break;
       // case to multiply two numbers    
         
        case '*':
        	  
            o = num1 * num2;
  
            break;
      // case to divide two numbers          
            
        case '/':
        	  
            o = num1 / num2;
  
            break;
       
      // case to find remainder
        
        case '%':
      	  
            o = num1 % num2;
  
            break;
            
        case '0':
        	  
            System.exit(0);
  
            break;   
          
      
      
  
        default: System.out.println("You entered wrong input");
  
            break;
        }
        
  
        System.out.println("Final result:");
  
        System.out.println();
  
        // print the final result
        System.out.println(num1 + " " + op + " " + num2
                           + " = " + o);
        
        
        String exit;
        Scanner sc1 = new Scanner(System.in);
        exit = sc1.next();
       sc1.close();
        
        System.out.println("Do You Want To Exit? press 'Yes' OR 'No'");
        if(exit=="Yes") {       
        	System.exit(0);
        }
        
        
        
//        System.out.println("Press 0 to Exit");
        
//        sc.close();
//       
  
       
    
    
    
    
    
       
    

    
    
    
    

    } 
}