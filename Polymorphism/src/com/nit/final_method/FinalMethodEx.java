package com.nit.final_method;

class A
{
	protected int a=10;
	protected int b=20;
	public final void calculate()
	{
		int sum=a+b;
		System.out.println("Sum is :"+sum);
	}
}

class B extends A
{
	public  void calculate1()//public  void calculate1()->Error:cannot override the final method from A
	{
		int mul=a*b;
		System.out.println("Mul is :"+mul);
	}
}
public class FinalMethodEx {
	public static void main(String[] args) {
		A a=new B();
		a.calculate();
	}

}
