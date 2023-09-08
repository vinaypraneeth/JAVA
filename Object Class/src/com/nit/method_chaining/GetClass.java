package com.nit.method_chaining;

public class GetClass {
    public static void main(String[] args) {
	   GetClass g=new GetClass();
		String name=g.getClass().getName();
		System.out.println("Name of the class is: "+name);
		
		String str="India";
		name=str.getClass().getName();
		System.out.println("Name of the class is: "+name);
	}
}
