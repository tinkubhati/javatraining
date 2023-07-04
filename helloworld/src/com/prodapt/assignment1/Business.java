//package com.prodapt.assignment1;
//
//public class Business {
//	
//	public void displayStudent(Student [] students)
//	{
//		for(int i=0;i<students.length;i++)
//		{
//			System.out.println("\nStudent No- ");
//			System.out.print(students[i].getStudentId());
//			System.out.println(students[i].getStudentName());
//			System.out.println(students[i].getStudentCity());
//		}
//	}
//	
//	
//	public void displayCitySorted(Student [] students)
//	{
//		for(int i=0;i<students.length;i++)
//		{
//			for(int j=i+1;j<students.length;j++)
//			{
//				if(students[i].getStudentCity().compareTo(students[j].getStudentCity())>0)
//				{
//					Student temp = students[i];
//					students[i] = students[j];
//					students[j] = temp;
//					
//				}
//			}
//		}
//		displayStudent(students);
//	}
//	
//	public void displayNameSorted(Student [] students)
//	{
//		for(int i=0;i<students.length;i++)
//		{
//			for(int j=i+1;j<students.length;j++)
//			{
//				if(students[i].getStudentName().compareTo(students[j].getStudentName())>0)
//				{
//					Student temp = students[i];
//					students[i] = students[j];
//					students[j] = temp;
//					
//				}
//			}
//		}
//		displayStudent(students);
//	}
//}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//
//}
