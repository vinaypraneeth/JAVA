package com.nit.hash_code;

class Employee1
{
	int eid;
	public Employee1(int eid)
	{
	this.eid=eid;	
	}
	@Override
	public int hashCode()//Overriding hashCode() method in a proper way
	{
		return eid;
	}
}
public class Demo4 {
    public static void main(String[] args) {
		Employee1 e1=new Employee1(444);
		Employee1 e2=new Employee1(417);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		System.out.println(e1);
		System.out.println(e2);
	}
}
