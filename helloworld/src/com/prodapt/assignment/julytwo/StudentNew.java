package com.prodapt.assignment.julytwo;
public class StudentNew <T, S>implements Comparable{

    String stuName;
    int stuID;
    int stuMarks;
    public StudentNew(String string, int i, int j) {
        // TODO Auto-generated constructor stub
    }


    public String getStuName() {
        return stuName;
    }
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    public int getStuID() {
        return stuID;
    }
    public void setStuID(int stuID) {
        this.stuID = stuID;
    }
    public int getStuMarks() {
        return stuMarks;
    }
    public void setStuMarks(int stuMarks) {
        this.stuMarks = stuMarks;
    }
    @Override
    public String toString() {
        return "Student2 [stuName=" + stuName + ", stuID=" + stuID + ", stuMarks=" + stuMarks + "]";
    }


    @Override
    public int compareTo(java.lang.Object o) {

    if(this.stuMarks == ((StudentNew)o).stuMarks){
    return 0;
    }
    else if(this.stuMarks<((StudentNew)o).stuMarks) {
        return 1;

    }
    else {
        return -1;
    }
    }

}