package com.nit.constructor;
import java.util.Scanner;
public class Main1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter employee Number: ");
	int eNo = sc.nextInt();
	System.out.println("Enter employee name: ");
	String eName=sc.nextLine();eName=sc.nextLine();
	System.out.println("Enter employee salary: ");
	double salary=sc.nextInt();
	Employee1 e2=new Employee1(eNo, eName, salary);
	//int employeeNumber = e2.getEmployeeNumber();
	String employeeName = e2.getEmployeeName();
	double employeeSalary = e2.getEmployeeSalary();
	if(employeeSalary==90000)System.out.println(employeeName+" is a "+"Developer");
	else if(employeeSalary==60000)System.out.println(employeeName+" is a "+"Designer");
	else if(employeeSalary==40000)System.out.println(employeeName+" is a "+"Tester");
	sc.close();
}
}
