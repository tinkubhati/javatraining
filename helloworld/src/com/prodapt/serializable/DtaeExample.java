package com.prodapt.serializable;

import java.util.Date;

public class DtaeExample {

	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.println("Our First Date is : " +date1);
		
		Date date2 = new Date(99999999999L);
		
		System.out.println("Our Second Date is : "+date2);
		
		Date date3 = new Date(999999999999L);
		
		System.out.println("Our Second Date is : "+date3);

	}

}
