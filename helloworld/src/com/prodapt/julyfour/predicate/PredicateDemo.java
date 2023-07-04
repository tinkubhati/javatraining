package com.prodapt.julyfour.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		List<Integer> listOfInteger = Arrays.asList(1,2,3,4,5,6,6,7,8,9,12,13,12,122,567,454,7,97556,75664);
		evaluate(listOfInteger, (c)-> c%2==0);
		System.out.println("*************************************");
		evaluate(listOfInteger, (c)-> c%2!= 0);

	}

	
	private static void evaluate(List<Integer> listOfInteger, Predicate<Integer> predicate) {
		
		for(Integer number : listOfInteger) {
			if(predicate.test(number)) {
				System.out.println(number);
			}
		}
		
	}
	
	
}
