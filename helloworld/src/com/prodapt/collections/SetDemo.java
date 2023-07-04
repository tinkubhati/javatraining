package com.prodapt.collections;

import java.util.HashSet;
import java.util.Set;

import com.prodapt.collections.Std;

public class SetDemo {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("Hello");
		set.add(null);
		set.add(15);
		set.add(15.5);
		set.add("Hello");
		set.add(null);
		System.out.println(set);
		Set<String> setOfStr = new HashSet<String>();
		setOfStr.add(null);
		setOfStr.add("Hello");
		setOfStr.add("Ayushi");
		setOfStr.add("hello");
		setOfStr.add("Shivam");
		System.out.println(setOfStr);
		
		Std std = new Std();
		std.setStudentId(14);
		std.setStudentMarks(99);
		std.setStudentName("Tinku");
		
		
		Std stud1 = new Std();
		stud1.setStudentId(14);
		stud1.setStudentMarks(92);
		stud1.setStudentName("Ravi");
		
		
		Std stud2 = new Std();
		stud2.setStudentId(1);
		stud2.setStudentMarks(93);
		stud2.setStudentName("Roop");
		
	
	}

}
