package com.kvaluent.assignment.eightjuly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quest1Main {

	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Tinku",9.8);
		Student s2 = new Student(2,"Suraj",8.8);
		Student s3 = new Student(3,"Roop",7.8);
		Student s4 = new Student(4,"Ravi",8.9);
		Student s5 = new Student(5,"Yogesh",8.6);
		Student s6 = new Student(6,"Rohan",7.8);
        
		List<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		
		Collections.sort(students, new StuComp());
		System.out.println(students);
		//students.forEach(

	}

}
