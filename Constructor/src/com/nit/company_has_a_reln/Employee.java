package com.nit.company_has_a_reln;

public class Employee {
private int employeeId;
private String employeeName;
private double employeeSalary;
private Company company;

public Employee(int employeeId, String employeeName, double employeeSalary, Company company) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeSalary = employeeSalary;
	this.company = company;
}

@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
			+ employeeSalary + ", company=" + company + "]";
}
}
