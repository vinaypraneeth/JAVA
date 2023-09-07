package com.nit.student;

public class DayScholar extends Student {
double transportFee;

public DayScholar(int studentId, String studentName, double examFee, double transportFee) {
	super(studentId, studentName, examFee);
	this.transportFee = transportFee;
}

public double payFee(double amount)
{
	double excessAmount=(payFee()+this.transportFee)-amount;
	return excessAmount;
}
public String displayDetails() {
	return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", studentName=" + studentName
			+ ", examFee=" + examFee + "]";
}

}
