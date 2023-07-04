package com.prodapt.julyfour;

public class PrintInfoMain {

	public static void main(String[] args) {
		
		PrintInformation pii = new PrintInformationImpl();  // we takes object of interface PrintInformation for collections . it also restrcis
		PrintInformationImpl pi = new PrintInformationImpl();
		
		pii.printMessage("I am Functional Interface ");
		pii.printMessage("a"
				+ "");
		pii.printInfo();
		
        PrintInformation.printInformation();
        
        PrintInformation p = (c)-> System.out.println( " Hello I understood ");
        p.printMessage("Hi");
        
	}

}
