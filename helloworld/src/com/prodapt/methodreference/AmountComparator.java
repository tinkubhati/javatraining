package com.prodapt.methodreference;

import java.util.Comparator;

public class AmountComparator implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {
		if (o1.getAmount()==o2.getAmount()) {
			return 1;
		}else if(o1.getAmount()>o2.getAmount()) {
			return 2;
		}else
			return -1;
	}

}
