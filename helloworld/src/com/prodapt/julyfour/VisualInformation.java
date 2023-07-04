package com.prodapt.julyfour;

public interface VisualInformation {

	public void printVisualInfo();
	
	public default void printVisualInformation() {
		
		System.out.println("I am into default method of VisualInformation interface");
	}
	
	
}
