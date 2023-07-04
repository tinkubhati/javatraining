package com.kvaluent.assignment.eightjuly;

import java.util.Scanner;
import java.util.TreeSet;

public class NoDuplicteNames {

	public static void main(String[] args) {
		String name;
		
		 TreeSet<String> names = new TreeSet<String>();
		 System.out.println("Enter the names 5 to be inserted ");
		 Scanner sc = new Scanner(System.in);
		 for(int i=1;i<6;i++) {
			 name = sc.nextLine();
			 names.add(name);
			 
			 }
		
//		 names.add("Roop");
//		 names.add("Tinku");
//		 names.add("Ravi");
//		 names.add("Rohan");
//		 names.add("Suraj");
		 
		 System.out.println("The Names In TreeSet Are : " + names);
		 
		 System.out.println("Enter the name to be Searched ");
		
         name = sc.next();
         if(names.contains(name)){
 	    	System.out.println("Hello " + name);
 	    }
 	    else	
 	    	System.out.println(" Sorry! Name Not Found");
 	}
   }

