package com.kvaluent.assignment.eightjuly;

import java.util.ArrayList;
import java.util.Scanner;

public class NameSearchArrList {

	public static void main(String[] args) {
		System.out.println("Enter The Names To 5 Be Inserted");
		Scanner sc=new Scanner(System.in);
	     String j; int flag = 0;
	     ArrayList l=new ArrayList();
	     for(int i=0;i<5;i++)
	     {  j=sc.nextLine();
	         l.add(j);
	     }
	     //Showing the names in arrayList
	    //System.out.println("Hello World"+l);
	    
	    System.out.println("*********************************");
	    System.out.println("Enter the name to be searched");
	    String name = sc.next();
	    if(l.contains(name)){
	    	System.out.println("Hello " + name);
	    }
	    else	
	    	System.out.println(" Sorry! Name Not Found");
	}

}
