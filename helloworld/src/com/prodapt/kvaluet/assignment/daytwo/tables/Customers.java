package com.prodapt.kvaluet.assignment.daytwo.tables;

public class Customers {
	int id;
	String name;
	int tier;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTier() {
		return tier;
	}
	public void setTier(int tier) {
		this.tier = tier;
	}
	public Customers(int id, String name, int tier) {
		
		this.id = id;
		this.name = name;
		this.tier = tier;
	}
	public Customers() {
		
	}
	
	
}

	
	
	


