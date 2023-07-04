package com.prodapt.dayfour;

public class StringOperations {

	public static void main(String[] args) {
		String str = "tinku";
		str= str.concat("bhati");
		System.out.println(str);

		
		StringBuffer sb = new StringBuffer("tinku");
		sb = sb.append(str);
		System.out.println(sb);
	}

}
