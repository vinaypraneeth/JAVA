package com.nit.method_overloading;

public class Ambiguity {
public void accept(String s)
{
	System.out.println("String is invoked...");
}
public void accept(Object b)
{
	System.out.println("Object is invoked...");
}
}

