package com.nit.co_variant;
 
class Animal
{
}
class Horse extends Animal
{
}

class Super
{
	public Animal display()
	{
		System.out.println("Super class display method..");
		return new Animal();
	}
	
}
class Sub extends Super
{
	@Override
	public Horse display()
	{
		System.out.println("Sub class display method....");
		return new Horse();
	}
}
public class CoVariant1 {
          public static void main(String[] args) {
			Super s=new Sub();
			Animal display = s.display();
			//System.out.println(display);
		}
}
