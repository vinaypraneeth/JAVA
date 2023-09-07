//to call the parameterized constructor
package com.nit.parameterized_constructor;

class Super
{
	public Super(String name)
	{
		System.out.println("My college name is "+name);
	}
}
class Sub extends Super
{
	public Sub()
	{
		super("SCITS");
		System.out.println("It is in Karimnagar");
	}
}
public class Main {
public static void main(String[] args) {
	new Sub();
}
}
