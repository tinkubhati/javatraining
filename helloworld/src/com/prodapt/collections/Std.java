package com.prodapt.collections;

public class Std implements Comparable {

	
	
	int studentId;
	String studentName;
	int studentMarks;
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}

	
	
	public Std(int studentId, String studentName, int studentMarks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}

	public Std() {
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ "]";
	}
	
	@Override
	public int compareTo(Object o) {
		if(this.Marks == (Std) o).Marks){
			
		}
		
		
		
	}
	
	
	
}
