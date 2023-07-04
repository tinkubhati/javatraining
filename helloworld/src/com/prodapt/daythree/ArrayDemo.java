package com.prodapt.daythree;

public class ArrayDemo {

	public static void main(String[] args) {
		int [] arr = new int[10];
		
		arr[0]=11;
		arr[1]=99;
		arr[2]=83;
		arr[3]=64;
		arr[4]=29;
		arr[5]=28;
		arr[6]=43;
		arr[7]=22;
		arr[8]=26;
		arr[9]=23;
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
			
		}
		System.out.println("***************************************************");
		int age[]= {12,323,21,212,345,56,43,56,4,3,343,3434,32};
		System.out.println(age[0]);
		
		System.out.println("***************************************************");
		for(int a:age) {
			System.out.println(a);
		}
		
//		Person person = new Person();
		
		System.out.println("***************************************************");
		Person[] personArr = new Person[5];
		personArr[0]= new Person(1,"Tinku","Bhati", 844840754 );
		personArr[1]= new Person(2,"Akhilesh","Bhatt", 844840731 );
		personArr[2]= new Person(2,"Akhilesh","Bhatt", 844840731 );
		personArr[3]= new Person(2,"Akhilesh","Bhatt", 844840731 );
		personArr[4]= new Person(2,"Akhilesh","Bhatt", 844840731 );
		
		for(Person persn : personArr) {
			System.out.println(persn.getPersonId());
			System.out.println(persn.getPersonFname());
			System.out.println(persn.getPersonLname());
			System.out.println(persn.getPersonNumber());
		}
		
		
		

	}

}
