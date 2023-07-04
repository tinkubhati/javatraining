package com.prodapt.serializable;

import java.io.Serializable;

public class Emp implements Serializable {
	private int empId;
	private transient String empName;
	public Emp() {
	}

	public Emp(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
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

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + "]";
	}
	

}
