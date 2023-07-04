package com.prodapt.julyfour.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<String> display = x-> System.out.println(x);
		display.accept("Consumer Functional Interface usage");
		
		//Higher order function
		//Simulates a forEach to
		//print each item from a list

		List<Integer> listOfInteger = Arrays.asList(1,2,3,4,5,6,7,8,8,9,12,13,14,14,15,15,34,43,24,24);
		Consumer<Integer> consumer = (Integer x) -> System.out.println(x);

		System.out.println("*****************Higher Order function is ---- displayInteger********** ");
		displayInfo(listOfInteger, consumer);
		System.out.println("*****************Higher order function is ----forEach********");
		listOfInteger.forEach(consumer);
		System.out.println("********************");
		listOfInteger.forEach((Integer x)->System.out.println(x));
	}

	// Custom higher order function
	public static <T> void displayInfo(List<T> list, Consumer<T> consumer) {
		for (T t : list) {
			consumer.accept(t);
		}
	}

}
