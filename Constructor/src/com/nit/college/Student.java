package com.nit.college;

public class Student {
private int studentId;
private String studentName;
private College clg;
public Student(int studentId,String studentName,College clg)
{
	super();
	this.studentId=studentId;
	this.studentName=studentName;
	this.clg=clg;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", clg=" + clg + "]";
}

}
