package com.nit.constructor;

import java.util.Scanner;

public class Employee {
private int employeeId;
private String employeeName;
private double employeeSalary;
public Employee(int eid,String ename,double salary)
{
	employeeId=eid;
	employeeName=ename;
	employeeSalary=salary;
}
public static Employee getEmployeeObject()
{
	Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Employee Id: ");
		int eid=sc.nextInt();
		System.out.println("Enter Employee Name: ");
		String ename=sc.nextLine();ename=sc.nextLine();
		System.out.println("Enter Employee Salary: ");
		double salary=sc.nextDouble();
		Employee e1=new Employee(eid, ename, salary);
		return e1;
	
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
			+ employeeSalary + "]";
}

}
