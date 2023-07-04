package com.kvaluent.assignment.eightjuly;

import java.util.Comparator;

public class NameComparator implements Comparator<Emplo> {

	@Override
	public int compare(Emplo o1, Emplo o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
