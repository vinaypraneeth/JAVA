package com.nit.method_overriding;

class A
{
	public void show()
	{
		System.out.println("class A");
	}
}
class B extends  A
{
	@Override
	public void show()
	{
		System.out.println("class B");
	}
}
public class CheckOverriding {
     public static void main(String[] args) {
		A a=new B();
    	 //B a=(B)new A();
		a.show();
	}
}
