package com.nit.hash_code;

class Employee
{
	int eid;
	@Override
	public int hashCode()
	{
		return 15;//here we are returning fixed values
	}
}
public class Demo3 {
     public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e.hashCode());
		
		Employee e1=new Employee();
		System.out.println(e1.hashCode());
	}
}
