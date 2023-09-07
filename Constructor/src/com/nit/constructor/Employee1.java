package com.nit.constructor;

public class Employee1 {
private int employeeNumber;
private String employeeName;
private double employeeSalary;
public Employee1(int eno,String ename,double salary)
{
	employeeNumber=eno;
	employeeName=ename;
	employeeSalary=salary;
}

public int getEmployeeNumber() {
	return employeeNumber;
}
//public void setEmployeeNumber(int employeeNumber) {
	//this.employeeNumber = employeeNumber;
//}
public String getEmployeeName() {
	return employeeName;
}
//public void setEmployeeName(String employeeName) {
	//this.employeeName = employeeName;
//}
public double getEmployeeSalary() {
	return employeeSalary;
}
//public void setEmployeeSalary(double employeeSalary) {
	//this.employeeSalary = employeeSalary;
}


