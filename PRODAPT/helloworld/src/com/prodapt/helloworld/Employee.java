package com.prodapt.helloworld;

import java.time.LocalDate;



public class Employee {
	private int empId;
	private String empName;
	private LocalDate dateOfBirth;
	private String designation;
	private LocalDate dateOfJoining;
	private double salary;
	
	Employee() {}
	
	public Employee(int empId, String empName, LocalDate dateOfBirth, String designation, LocalDate dateOfJoining, double salary)
	{
		this.empId = empId;
		this.empName = empName;
		this.dateOfBirth = dateOfBirth;
		this.designation = designation;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double increasedSalary(double percentage)
	{
		double increasedSal = (1+percentage)*this.salary;
		return increasedSal;
	}

	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dateOfBirth=" + dateOfBirth + ", designation="
				+ designation + ", dateOfJoining=" + dateOfJoining + ", salary=" + salary + "]";
	}

	public void displayEmployeeDetails()
	{
		System.out.println(empId+" "+empName+" "+dateOfBirth+" "+designation+" "+dateOfJoining+" "+salary);
	}
}
