package com.prodapt.kvaluet.assignment.daytwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class TouristMain {

	public static void main(String[] args) {
	ArrayList<Tourist> list = new ArrayList<Tourist>();
	list.add(new Tourist(1,"Tinku","Greater Noida"));
	list.add(new Tourist(2,"Suraj","Aligarh"));
	list.add(new Tourist(3,"Ravi","Bihar"));
	list.add(new Tourist(1,"Yogesh","Dadri"));
	list.add(new Tourist(4,"Roop"," Greater Noida"));
	list.add(new Tourist(1,"Rohan","Delhi"));
	
	
	Iterator itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	
	System.out.println("    ");
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the city : ");
	String a=sc.nextLine();
	
	for(int i=0;i<list.size();i++) {
		if(list.get(i).getCity().equals(a)) { 	
			System.out.println(list.get(i));
		}
	}
	
	
    System.out.println("   ");
    System.out.println("sorting on the basis of Name");
	
	Collections.sort(list,new NameComp());  
	for(Tourist dm:list){  
         System.out.println(dm.getId()+"   "+dm.getName()+"   "+dm.getCity());
	}  
	
	System.out.println("   ");
    System.out.println("sorting on the basis of City");
	
	Collections.sort(list,new CityComp());  
	for(Tourist dm:list){  
         System.out.println(dm.getId()+"   "+dm.getName()+"   "+dm.getCity());
	}  
	

	}

}
