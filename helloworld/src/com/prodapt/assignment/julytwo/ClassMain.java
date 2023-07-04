package com.prodapt.assignment.julytwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ClassMain {
	public static <T extends Number> Number subtract(T t1, T t2)
	 {
			return t1.doubleValue() - t2.doubleValue();
	 }

	public static <T extends Number> Number divide(T t1, T t2) {
		try {
			return t1.doubleValue()/t2.doubleValue();
		}catch(ArithmeticException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public static void main(String args[]) {
		Integer i1 =34, i2 = 0;
		 System.out.println("Integer Subtract with generic method: " +
		ClassMain.subtract(i1, i2));
		 Float f1 = 12.56f, f2 = 3.6778f;
		 System.out.println("Float Subtract with generic method: " +
		ClassMain.subtract(f1, f2));
		 
		 System.out.println("Integer divide : " + ClassMain.divide(i1, i2));
		 System.out.println("Float divide : " + ClassMain.divide(f1 , f2));
		 
		 System.out.println("***************************");
		 
		 System.out.println("Integer arraylist : ");
		 List<Integer> list = new ArrayList<Integer>();
		 for(int i=1; i<=5;i++) {
			 list.add(i);
		 }
		 System.out.println(list);
		 Swap.swap(list, 0, 2);
		 System.out.println(list);
		 
		 System.out.println("Integer vector : ");
		 List<Integer> list1 = new Vector<Integer>();
		 for(int i=1; i<=5;i++) {
			 list1.add(i);
		 }
		 System.out.println(list1);
		 Swap.swap(list1, 0, 2);
		 System.out.println(list1);
		 
		 System.out.println("Float arraylist : ");
		 List<Float> list2 = new ArrayList<Float>();
		 for(float i=1.3f; i<=5.3f;i++) {
			 list2.add(i);
		 }
		 System.out.println(list2);
		 Swap.swap(list2, 0, 2);
		 System.out.println(list2);
		 
		 System.out.println("//////////////////////");
		 Integer arr[] = new Integer[5];
		 System.out.println("Unswaped Array : ");
		 for(Integer i=0;i<5;i++) {
			 arr[i] = i;
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println();
		 Swap.swap(arr, 0, 3);
		 System.out.println("Swapped Array");
		 for(Integer i=0;i<5;i++) {
			 System.out.print(arr[i]+" ");
		 }	 
	}
}
