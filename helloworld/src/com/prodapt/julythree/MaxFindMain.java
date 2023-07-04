package com.prodapt.julythree;

import java.util.ArrayList;
import java.util.List;

public class MaxFindMain {

	public static void main(String[] args) {
		
	
		MaxFinder maxFinder = (num1, num2)->num1>num2?num1:num2;
		int max = maxFinder.maximum(12, 213);
		System.out.println(max);
		
		
		List<String> currencies = new ArrayList<String>();
		currencies.add("USD");
		currencies.add("INR");
		currencies.add("YEN");
		currencies.add("YUAN");
		currencies.add("EURO");
		
		currencies.forEach(c->System.out.println(c));
	}

}
