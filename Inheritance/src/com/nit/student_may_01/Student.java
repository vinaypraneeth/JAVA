package com.nit.student_may_01;

public class Student {
private Integer studentId;
public Student()
{
	studentId=18417;
	Trainer t=new Trainer(this);
}
public void display()
{
	System.out.println("studentId: "+studentId);
}
}
