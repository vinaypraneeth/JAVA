package com.nit.method_overriding;

class Animal
{
	void eat()
	{
		System.out.println("I can't say..");
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("Dog is non-veg type..");
	}
}
class Rabbit extends Animal
{
	void eat()
	{
		System.out.println("Rabbit is Veg type..");
	}
}
public class AnimalDemo {
	 public static void main(String[] args) {
		Animal a1=new Dog();
		a1.eat();
		Animal a2=new Rabbit();
		a2.eat();
	}

}
