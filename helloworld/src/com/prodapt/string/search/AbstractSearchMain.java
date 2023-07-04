package com.prodapt.string.search;

import java.util.Scanner;


public class AbstractSearchMain {
	public static void main(String[] args) {
	
	System.out.println("Enter The Size of  String Array");
	Scanner tb = new Scanner(System.in);
	
	int size = tb.nextInt();
	ObjList[] obj_list = new ObjList[size];{
	for(int i=0;i<size;i++)
	{
		obj_list[i] = new ObjList();
		System.out.println("Enter Strings : ");
		String j= tb.next();
		obj_list[i].str = j;
	}
	System.out.println("Enter String to be searched-: ");
	String searchString = tb.next();
	
	
	ObjList objSearch = new ObjList();
	objSearch.str = searchString;
	StringSearch stringsearchfn = new StringSearch();
	
	System.out.println(stringsearchfn.search(obj_list, objSearch));
	
	tb.close();
}	
}
}
