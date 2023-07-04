package com.prodapt.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentNewComparatorDemo {

	public static void main(String[] args) {
		
		List<StudentNew> studentNewList = new ArrayList<StudentNew>();
		studentNewList.add(new StudentNew (1,"Tinku",89.43,24));
		studentNewList.add(new StudentNew (2,"Roop",79.43,44));
		studentNewList.add(new StudentNew (1,"Suraj",84.43,34));
		studentNewList.add(new StudentNew (1,"Ravi",81.43,27));
		
		
		System.out.println(studentNewList);
		
		System.out.println("Sorting by Names");
		Collections.sort(studentNewList, new NameComparator());
		System.out.println(studentNewList);
		
		System.out.println("Sorting by Marks");
		Collections.sort(studentNewList, new MarksComparator());
		System.out.println(studentNewList);
		
		System.out.println("Sorting by Age");
		Collections.sort(studentNewList, new AgeComparator());
		System.out.println(studentNewList);
		
		System.out.println("Reverse order ");
		Collections.reverse(studentNewList);
		System.out.println(studentNewList);
		
		
	
		
	}

}
