package com.nit.method_overloading;

public class VarArgs {
public void acceptData(Object ...obj)
{
	for(Object o:obj)
	{
		System.out.println(o);
	}
}
}
