package com.prodapt.assignment;

import java.util.Scanner;

public abstract class Quadrilateral {
	private static int base;
	private static int height;
	
	

	
	public Quadrilateral() {
		
	}
	
	

	public Quadrilateral(Integer base, Integer height) {
		
		Quadrilateral.base = base;
		Quadrilateral.height = height;
	}



	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		Quadrilateral.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		Quadrilateral.height = height;
	}

	public abstract Integer area(Integer base,Integer height);
	 

    	
    
    	
    public static void main(String[] args) {
    	
    	
    	System.out.println("Enter Base");
    	
    	Scanner b = new Scanner (System.in);
    	  
    	base= b.nextInt();
    	
    	System.out.println("Enter Height");
    	
    	height = b.nextInt();
    	
    	b.close();
    	
    	
    	
     Rectangle rectangle = new Rectangle();
     System.out.println("AREA OF RECTANGLE IS:"+rectangle.area(base, height));
     
     
     Square1 square = new Square1();
     System.out.println("AREA OF SQUARE IS:"+ square.area(base, height));
     
     
     Parallelogram parallelogram = new Parallelogram();
     System.out.println("AREA OF PARALLELOGRAM IS:"+ parallelogram.area(base, height));
    
    }
    }
    




//nextBoolean()	Reads a boolean value from the user
//nextByte()	Reads a byte value from the user
//nextDouble()	Reads a double value from the user
//nextFloat()	Reads a float value from the user
//nextInt() 	Reads a integer value from the user
//nextLine()	Reads a String value from the user
//nextLong()	Reads a long value from the user
//nextShort()	Reads a short value from the user
   


