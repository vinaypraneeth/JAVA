package com.nit.overriding_booleans_equals_method;

public class ELC {
    public static void main(String[] args) {
		Customer c1=new Customer(111,"virat");
		Customer c2=new Customer(111,"VIRAT");
		Student s1=new Student(111,"virat");
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(s1));
		
		System.out.println(c1.equals(null));//for null instanceof operator provdes false
	}
}
