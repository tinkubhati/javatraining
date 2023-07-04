package com.prodapt.assignment1;

import java.util.Scanner;

public class StudentMain  {

	public static void main(String[] args) {
		int id = 0;
		Student student = new Student();
		Student[] studentArr = new Student[6];
		studentArr[0] = new Student(1,"Tinku","Greater Noida");
		studentArr[1] = new Student(2,"Roop","Greater Noida");
		studentArr[2] = new Student(3,"Suraj","Aligarh");
		studentArr[3] = new Student(4,"Rohan","Noida");
		studentArr[4] = new Student(5,"Ravi","Noida");
		studentArr[5] = new Student(6,"Yogesh","Dadri");

		DisplayStudents display = new DisplayStudents();
		display.displayStudent(studentArr);


		System.out.println("Enter The City");
		Scanner sc = new Scanner(System.in);
		String city = sc.nextLine();

		int count =0;
		for(int i=0;i<studentArr.length;i++) 
		{

			if(studentArr[i].getStudentCity().equalsIgnoreCase(city)){
				System.out.println(studentArr[i]);
				count =1;
			}
		}
		if(count == 0)
		{
			System.out.println("Not Found");
		}


		System.out.println("Enter the Id to fetch the Record");
		id= sc.nextInt();

		for(int i=0;i<studentArr.length;i++){
			if(studentArr[i].getStudentId() == id) {
				System.out.println("Record with Student Id: "  +  id  + studentArr[i]);
				count = 1;
			}
		}if (count == 0) { System.out.println("No Record Found Enter Correct Id");}

        System.out.println("Enter the length upto which you want to SORT");
		int d =sc.nextInt();
		Student temp;
		for(int i= 0;i<d;i++)
			for(int j=0 ;j<d;j++) {
				if(studentArr[j].getStudentCity().compareToIgnoreCase(studentArr[i].getStudentCity()) > 1) {
					
					temp = studentArr[i];
					studentArr[i]=studentArr[j];
					studentArr[j] = temp;
						}
					}
		           System.out.println("Sorted City Names Are : ");
		           for(int i=0;i<d;i++) {
		        	   System.out.println(studentArr[i]);
		           }
		           
		System.out.println("Enter the length upto which you want to SORT Names");
		int s = sc.nextInt();
		Student tep;
		for(int i= 0;i<d;i++)
			for(int j=0 ;j<d;j++) {
				if (studentArr[j].getStudentName().compareToIgnoreCase(studentArr[i].getStudentName())>0) {
					
					temp = studentArr[i];
					studentArr[i] = studentArr[j];
					studentArr[j] = temp;
					
				}
			}
				 System.out.println("Sorted Names Are : ");
		           for(int i=0;i<d;i++) {
		        	   System.out.println(studentArr[i]);
			
		      } 
	}
	
}

///**	for(Student stud: studentArr)
////	
////	System.out.println(stud);
//**/




