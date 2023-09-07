package com.nit.student;

public class Student {
int studentId;
String studentName;
double examFee;
public Student(int studentId, String studentName, double examFee) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.examFee = examFee;
}
public double payFee()
{
	
	return examFee;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", examFee=" + examFee
			+ "]";
}


}
