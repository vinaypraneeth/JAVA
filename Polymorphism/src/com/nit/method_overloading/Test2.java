package com.nit.method_overloading;

class Input
{
	public void accept(byte b)
	{
		System.out.println("byte is invoked...");
	}
	public void accept(short s)
	{
		System.out.println("short is invoked...");
	}
}
public class Test2 {
public static void main(String[] args) {
	Input i=new Input();
	i.accept((byte)9);
	i.accept((short)4);
}
}
