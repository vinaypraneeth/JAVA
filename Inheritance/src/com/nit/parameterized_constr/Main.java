//Calling the parameterized constructor of same class.
package com.nit.parameterized_constr;

class A
{
	public A(String sport)
	{
		
		System.out.print("My favourite "+sport+" player ");
	}
	public A()
	{
		this("cricket");
		System.out.print(" is ");
	}
}
  class B extends A
   {
	  public B()
	  {
		  this("Virat Kohli");
	  }
	public B(String playerName)
	{
		System.out.print(playerName);
	}
   }
public class Main {
public static void main(String[] args) {
	new B();
}
}
