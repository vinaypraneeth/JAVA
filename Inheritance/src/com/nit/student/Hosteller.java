package com.nit.student;

public class Hosteller extends Student {
double hostelFee;

public Hosteller(int studentId, String studentName, double examFee, double hostelFee) {
	super(studentId, studentName, examFee);
	this.hostelFee = hostelFee;
}
public double payFee(double amount)
{
	double excessAmount=(payFee()+this.hostelFee)-amount;
	return excessAmount;
}
public String displayDetails() {
	return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", studentName=" + studentName
			+ ", examFee=" + examFee + "]";
}

}
