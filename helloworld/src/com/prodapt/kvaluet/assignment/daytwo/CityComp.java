package com.prodapt.kvaluet.assignment.daytwo;

import java.util.Comparator;

public class CityComp implements Comparator<Tourist> {

	@Override
	public int compare(Tourist o1, Tourist o2) {
		
		return o1.getCity().compareTo(o2.getCity());
	}

}
