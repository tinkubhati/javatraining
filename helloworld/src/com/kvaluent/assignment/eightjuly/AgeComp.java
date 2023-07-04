package com.kvaluent.assignment.eightjuly;

import java.util.Comparator;

public class AgeComp implements Comparator<Emplo> {

	@Override
	public int compare(Emplo o1, Emplo o2) {
		if(o1.getAge()== o2.getAge()) {
		return 0;
	}else if(o1.getAge()>o2.getAge()) {
		return 1;
		
	}else 
		return -1;
	}

}