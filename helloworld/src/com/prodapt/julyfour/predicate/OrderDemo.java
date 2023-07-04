package com.prodapt.julyfour.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.prodapt.methodreference.Order;

public class OrderDemo {

	public static void main(String[] args) {
		
		Order order1 = new Order("AUD",1500000);
		Order order2 = new Order("INR",500000);
		Order order3 = new Order("USD",15000);
		Order order4 = new Order("EUR",150000);
		Order order5 = new Order("AUD",80000);
		Order order6 = new Order("EUR",170000);
		
		List<Order> orderList = new ArrayList<Order> ();
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		orderList.add(order4);
		orderList.add(order5);
		orderList.add(order6);
			
		System.out.println(orderList);
		
		evaluate(orderList,(o)-> o.getCurrency().equals("EUR"));

	}
	
	private static void evaluate(List<Order> orderList,Predicate<Order> predicate) {
		Double totalAmount = 0.0;
		for(Order order: orderList) {
			if(predicate.test(order))
				System.out.println(order);
			
			
		}
		
		
	}

}
