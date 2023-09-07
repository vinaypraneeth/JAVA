//2.Super keyword: to call the method of the super class
package com.nit.super_calling_method;
class A
{
	public void show()
	{
		System.out.println("This is class A(Super class)");
	}
}
   class B extends A
   {
	  public void show()
	  {
		  System.out.println("This is class B(Sub class)");
		  super.show();
	  }
   }
public class Main {
public static void main(String[] args) {
	new B().show();
}
}
