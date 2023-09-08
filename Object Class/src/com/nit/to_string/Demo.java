package com.nit.to_string;

public class Demo {
	
	@Override
	public String toString()//Overriding the toString() method in our userdefined class 
	{
		return "Deloitte";
	}
	/*public String toString()
	{
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}*/
	
public static void main(String[] args) {
	Object d=new Demo();
	System.out.println(d);
}
}
