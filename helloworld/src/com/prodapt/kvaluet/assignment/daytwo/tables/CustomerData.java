package com.prodapt.kvaluet.assignment.daytwo.tables;

import java.util.ArrayList;
import java.util.List;

public class CustomerData {
	public List<Customers> customerDatabase(){
		List<Customers> customers = new ArrayList<Customers>();
		Customers c1 = new Customers(1, "Stefan Walker", 1);

		Customers c2 = new Customers(2, "Daija Von", 1);

		Customers c3 = new Customers(3, "Ariane Rodriguez", 1);

		Customers c4 = new Customers(4, "Marques Nikolaus", 2);

		Customers c5 = new Customers(5, "Rachelle Greenfelder", 0);

		Customers c6 = new Customers(6, "Larissa White", 2);

		Customers c7 = new Customers(7, "Fae Heidenreich", 1);

		Customers c8 = new Customers(8, "Dino Will", 2);

		Customers c9 = new Customers(9, "Eloy Stroman", 1);

		Customers c10 = new Customers(10, "Brisa O Connell", 1);
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		customers.add(c5);
		customers.add(c6);
		customers.add(c7);
		customers.add(c8);
		customers.add(c9);
		customers.add(c10);
		return customers;
	}
}