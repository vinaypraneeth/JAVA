//1.Super Keyword: Used to access the super class variable
package com.nit.super_calling_var;

class Father
{
	protected double balance=2000;
}
class Son extends Father
{
	protected double balance=4000;
	public Son()
	{
		System.out.println("Son balance is : "+balance);
		System.out.println("Father balance is:"+super.balance);
	}	
}
public class Main {

	public static void main(String[] args) {
		
		new Son();
	}
}
