package com.prodapt.julythree;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<String, Double> balance = new Hashtable<String, Double>();
		Enumeration names;
		String str;
		double bal;
		balance.put("Tinku", 334.434);
		balance.put("Roop", 3423.234);
		balance.put("Ravi", 324.32);
		System.out.println(balance);
		bal = balance.get("Roop");
		System.out.println(bal);
      
		  names = balance.keys();
		  while(names.hasMoreElements()) {
			  str = (String) names.nextElement();
			  System.out.println(str+ ":");
		  }

	}

}
