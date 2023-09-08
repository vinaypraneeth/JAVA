package com.nit.static_method_overriding;

class Super
{
	public static void accept() {
		System.out.println("static method of super class..");
	}
}
class Sub extends Super{
	//@Override
      public static void accept() {
    	  System.out.println("static method of sub class...");
      }
}
public class StaticOverride {
	public static void main(String[] args) {
		Super s=new Sub();
		s.accept();
		Sub s1=new Sub();
		s1.accept();
	}

}
