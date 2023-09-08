package com.nit.method_overloading;

class Test
{
	public void input(int ...x )
	{
		System.out.println("var args executed...");
	}
}
public class Main {
	public static void main(String [] args) {

             Test t1=new Test();
            // t1.input();
             t1.input(1);
            // t1.input(15,19);
            // t1.input(10,20,30,40,50,5.5);
             
	}
}
