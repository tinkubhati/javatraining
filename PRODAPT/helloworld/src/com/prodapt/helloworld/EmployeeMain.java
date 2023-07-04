package com.prodapt.helloworld;

public class EmployeeMain {
	public static void main(String[] args)
	{
		Employee employee = new Employee(1,"Rathi",null,"Associate",null,50000.00);
		
		employee.setSalary(employee.increasedSalary(0.5));
		employee.displayEmployeeDetails();
		System.out.println(employee.toString());
	}
}