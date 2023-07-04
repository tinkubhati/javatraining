package com.prodapt.assignment.julytwo;

import java.util.Collections;
import java.util.List;

public class Swap {
	public static <T extends List<?>> List<?> swap(List<?> list, int firstPos, int secondPos) {
		try {
			Collections.swap(list, firstPos, secondPos);
			return list;
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			return list;
		}
	}
	
	 public static <T> T[] swap(T [] list, int firstPos, int secondPos) {
		 try {
			 T temp = list[firstPos];
			 list[firstPos] = list[secondPos];
			 list[secondPos] = temp;
			 return list;
		 }catch(Exception e) {
			 e.printStackTrace();
			 return list;
		 }
	 }

}
