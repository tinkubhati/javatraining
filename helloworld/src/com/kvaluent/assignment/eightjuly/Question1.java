package com.kvaluent.assignment.eightjuly;

import java.util.ArrayList;

public class Question1 {

	public static void main(String[] args) {
		
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add(args[0]);
		nameList.add(args[1]);
		nameList.add(args[2]);
		nameList.add(args[3]);
		if(nameList.contains(args[4])) {
			System.out.println("Hello " + args[4]);
		}
		else {
			System.out.println("Name Not Found");
		}
		
	}

}
