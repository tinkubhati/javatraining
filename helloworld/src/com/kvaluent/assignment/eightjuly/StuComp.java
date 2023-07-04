package com.kvaluent.assignment.eightjuly;

import java.util.Comparator;

public class StuComp implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getCgpa()>o2.getCgpa()) {
			return -1;
		}else if(o1.getCgpa()<o2.getCgpa()) {
			return 1;
		}
		else if(o1.getCgpa() == o2.getCgpa()) {
			if(o1.getFname().equals(o2.getFname())) {
				return(o1.getId()-o2.getId());
			}else
				return(o1.getFname().compareTo(o2.getFname()));
				
		}
			
		return 0;	
	}

}
