package com.prodapt.dayfour;

import java.io.FileNotFoundException;

public class ThrowableDemo {

	public static void main(String[] args) {
		try {
      proc();
		}catch (FileNotFoundException e) {
			System.out.println(" Error Code-404 :File Not Found");
		}
		
	
	
	
	}
	
	static void proc() throws FileNotFoundException {
		try {
			throw new FileNotFoundException ("From Exception");
		}
		catch(FileNotFoundException fnfe){
			System.out.println("Caught inside proc method");
		    throw fnfe; //rethrow the exception	
			
		}
	}
	
	

}
