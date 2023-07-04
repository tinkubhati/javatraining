package com.prodapt.methodreference;

public class Order {

	private String currency;
	private int amount;
	
	
	public Order() {
	}
	

    //
	public Order(int amount) {
		this.amount = amount;
	}



	public Order(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "Order [currency=" + currency + ", amount=" + amount + "]";
	} 
	
	public static void displayCurrency(){
		System.out.println("Static Method display currency");
	}
	
	public void displayAmount() {
		System.out.println("mhnm");
	}
	
	
}
