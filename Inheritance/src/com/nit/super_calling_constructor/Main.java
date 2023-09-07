//1.calling the No argument or default constructor
package com.nit.super_calling_constructor;

class A
{
	public A()
	{
		//super();(implicit)
		System.out.println("Class A");
	}
}
class B extends A
{
	public B()
	{
		//super();(implicit)
		System.out.println("Class B");
	}
}
class C extends B
{
	public C()
	{
		//super();(implicit)
		System.out.println("Class C");
	}
}
public class Main {
public static void main(String[] args) {
	new C();
}
}
