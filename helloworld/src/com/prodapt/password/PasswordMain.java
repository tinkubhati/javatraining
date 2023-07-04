package com.prodapt.password;

import java.util.Scanner;

public class PasswordMain {
	
	static String usern;
	static String pass;

	public static void main(String[] args) {
//		 Password password = new Password();
		 Password [] passwordArr = new Password[10];
		 passwordArr[0]= new Password("bhati@123","bhati");
		 passwordArr[1]= new Password("nagar@123","nagar");
		 passwordArr[2]= new Password("bisht@123","bisht");
		 passwordArr[3]= new Password("shahi@123","shahi");
		 passwordArr[4]= new Password("agrawal@123","agrawal");
		 passwordArr[5]= new Password("shishodia@123","shishodia");
		 passwordArr[6]= new Password("bisht@123","bisht");
		 passwordArr[7]= new Password("shahi@123","shahi");
		 passwordArr[8]= new Password("agrawal@123","agrawal");
		 passwordArr[9]= new Password("shishodia@123","shishodia");
		 
		 
		 System.out.println("Enter The Username ");
		 Scanner sc = new Scanner(System.in);
		 
		 usern=sc.nextLine();
		 System.out.println("*************************************************************************** ");
		 System.out.println("Enter The Password ");
		 pass=sc.nextLine();
		  sc.close();
		 int count=0;
		 for(int i=0;i<passwordArr.length;i++) {
			 
			 if((passwordArr[i].getUsername().equals(usern))&&(passwordArr[i].getPassword().equals(pass))) {
				 count=1;
				 System.out.println("Welcome User:" + usern +"!!");
			 }
			 
		 }
			 if(count==0) {
				 System.out.println("Please Enter Correct Username And Password");
			 }
			 
		 }
	
	}


