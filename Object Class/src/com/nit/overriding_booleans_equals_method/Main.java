package com.nit.overriding_booleans_equals_method;

public class Main {
public static void main(String[] args) {
	Employee e1=new Employee(444,"Virat");
	Employee e2=new Employee(444,"Kohli");
	System.out.println(e1.equals(e2));
}
}
