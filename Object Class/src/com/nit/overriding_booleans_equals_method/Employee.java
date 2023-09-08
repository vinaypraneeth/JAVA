package com.nit.overriding_booleans_equals_method;

public class Employee {
 private int employeeId;
 private String employeeName;
 
 public Employee(int employeeId,String employeeName)
 {
	 super();
	 this.employeeId=employeeId;
	 this.employeeName=employeeName;
 }
 @Override
 public boolean equals(Object obj)
 {
	 Employee e2=(Employee)obj;
	 int id1=this.employeeId;
	 String name1=this.employeeName;
	 
	 int id2=e2.employeeId;
	 String name2=e2.employeeName;
	 if(id1==id2&&name1.equals(name2))return true;
	 else return false;
	 
 }
}
