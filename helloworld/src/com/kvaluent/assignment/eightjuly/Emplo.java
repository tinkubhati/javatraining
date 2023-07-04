package com.kvaluent.assignment.eightjuly;

public class Emplo {
	public String name;
	public int age;
	public int salary;

	public Emplo() {
	}
	
	public Emplo(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emplo [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}
