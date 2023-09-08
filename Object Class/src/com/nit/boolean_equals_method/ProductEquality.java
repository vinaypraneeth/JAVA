package com.nit.boolean_equals_method;

public class ProductEquality {
public static void main(String[] args) {
	Product p1=new Product(444,"Mobile");
	Product p2=new Product(417,"Laptop");
	Product p3=new Product(444,"Mobile");
	Product p4=p2;
	System.out.println(p1==p2);//false
	System.out.println(p1==p3);//false
	System.out.println(p2==p4);//true
	
	System.out.println(p1.equals(p2));//false
	System.out.println(p1.equals(p3));//false
	System.out.println(p2.equals(p4));//true
}
}
