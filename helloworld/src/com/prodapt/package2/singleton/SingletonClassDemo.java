package com.prodapt.package2.singleton;


public class SingletonClassDemo {

	
	public static void main(String[] args) {
		SingletonClass object = SingletonClass.getInstance();
		System.out.println(object instanceof SingletonClass);
		System.out.println(object.hashCode());
		
		
		SingletonClass object1 = SingletonClass.getInstance();
		System.out.println(object1 instanceof SingletonClass);
		System.out.println(object1.hashCode());
		}
 }
