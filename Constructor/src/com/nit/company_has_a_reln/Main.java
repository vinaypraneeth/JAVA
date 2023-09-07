package com.nit.company_has_a_reln;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Company Name: ");
	String companyName = sc.nextLine();
	
	System.out.print("Enter the Company Location: ");
	String companyLocation = sc.nextLine();
	
	System.out.print("Enter the employee Id: ");
	int employeeId = sc.nextInt();
	
	System.out.print("Enter the employee Name: ");
	String employeeName=sc.nextLine();employeeName=sc.nextLine();
	
	System.out.print("Enter the employee salary: ");
	double employeeSalary=sc.nextDouble();
	
	Company comp = new Company(companyName, companyLocation);
	Employee emp= new Employee(employeeId, employeeName, employeeSalary, comp);
	System.out.println(emp);
	
	sc.close();
}
}
