package com.kvaluent.assignment.eightjuly;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Emplo> {
	
	@Override
	public int compare(Emplo o1, Emplo o2) {
		if(o1.getSalary()== o2.getSalary()) {
		return 0;
	}else if(o1.getSalary()>o2.getSalary()) {
		return 1;
		
	}else 
		return -1;
	}

	
	
	

}
