package com.nit.co_variant;


class Parent
{
	public Number show()
	{
		System.out.println("Parent:show method");
		return null;
	}
}
class Child extends Parent
{
	@Override
	public Integer show()
	{
		System.out.println("Child:show method");
		return null;
	}
	
}
public class CoVariant2 {
         public static void main(String[] args) {
			Parent p=new Child();
			Number show = p.show();
			System.out.println(show);
		}
}
