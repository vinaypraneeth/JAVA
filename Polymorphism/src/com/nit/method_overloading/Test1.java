package com.nit.method_overloading;

public class Test1 {
	public void acceptData(int... x)
	{
	int total=0;
	for(int y:x)
	{
		total=total+y;
	}
	System.out.println("Sum of the parameter is : "+total);
	}
}
