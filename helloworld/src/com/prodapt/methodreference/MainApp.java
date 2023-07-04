package com.prodapt.methodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainApp {

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
		//Traditional comparator method
		Collections.sort(orderList,new AmountComparator());
		System.out.println(orderList);
		
		System.out.println("********************************************************************");
		Collections.sort(orderList, Comparator.comparing(Order::getCurrency));
		orderList.forEach(System.out::println);
		
		System.out.println("*******************************Sorting on basis of* *");
		Collections.sort(orderList, Comparator.comparing(Order::getCurrency));
		orderList.forEach(System.out::println);
		
		//Static method reference example
		DisplayInformation displ = Order::displayCurrency;
		displ.display();
		
		//Reference to instance method
		DisplayInformation displayInfo = order1::displayAmount;
		displayInfo.display();
		
		//Reference to constructor
		
		OrderAmount orderAmount = Order::new;
		System.out.println(orderAmount.getOrderAmount(1121223334));
	
	}

}
