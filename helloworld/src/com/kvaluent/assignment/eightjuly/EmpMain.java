package com.kvaluent.assignment.eightjuly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		

		List<Emplo> empList = new ArrayList<Emplo>();
		empList.add(new Emplo ("Tinku", 21,97898));
		empList.add(new Emplo ("Roop",22,44000));
		empList.add(new Emplo ("Suraj",32,34000));
		empList.add(new Emplo ("Ravi",24,27000));
		empList.add(new Emplo ("Rohan",23,37000));
		empList.add(new Emplo ("Yogita",21,36000));
		empList.add(new Emplo ("Jyoti",22,31000));
		
		
		
		System.out.println(empList);
		
		
		System.out.println("Sorting by Age");
		Collections.sort(empList, new AgeComp());
		System.out.println(empList);
		
		System.out.println("Sorting By Name : ");
		Collections.sort(empList,new NameComparator());		
		System.out.println(empList);
		
		System.out.println("Sorting By Salary");
		Collections.sort(empList, new SalaryComparator());	
		System.out.println(empList);
		
	
		
		
	}

}














//}catch(FileNotFoundException fnfe) {
//fnfe.printStackTrace();
//}catch (IOException e1) {
//e1.printStackTrace();
//}catch(ClassNotFoundException e1) {
//e1.printStackTrace();









