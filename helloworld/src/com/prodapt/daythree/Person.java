package com.prodapt.daythree;

public class Person {
   
	private Integer personId;
    private String personFname;
    private String personLname;
    private Integer personNumber;
    
    public Person(Integer personId, String personFname, String personLname, Integer personNumber) {
		
		this.personId = personId;
		this.personFname = personFname;
		this.personLname = personLname;
		this.personNumber = personNumber;
	}


	public Integer getPersonId() {
		return personId;
	}


	public void setPersonId(Integer personId) {
		this.personId = personId;
	}


	public String getPersonFname() {
		return personFname;
	}


	public void setPersonFname(String personFname) {
		this.personFname = personFname;
	}


	public String getPersonLname() {
		return personLname;
	}


	public void setPersonLname(String personLname) {
		this.personLname = personLname;
	}


	public Integer getPersonNumber() {
		return personNumber;
	}


	public void setPersonNumber(Integer personNumber) {
		this.personNumber = personNumber;
	}
    
    
    
    
}
