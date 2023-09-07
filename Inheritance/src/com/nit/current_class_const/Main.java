//to call the current class no argument constructor
package com.nit.current_class_const;

class A
{
	public A()
	{
		System.out.print("Virat kohli's wife ");
	}
	public A(String name)
	{
		this();
		System.out.print(name);
	}
}
class B extends A
{
	public B()
	{
		super("Anushka Sharma");
		System.out.print(" And his daughter Vamika ");
	}
}
public class Main {

	public static void main(String[] args) {
		new B();

	}

}
