package com.nit.Square_area;

class Shape
{
	int a;
	public Shape(int a)
	{
		this.a=a;
		System.out.println("a="+a);
	}	
}
class Square extends Shape
{
	public Square (int s)
	{
		super(s);
	}
	public void getArea()
	{
		System.out.println("Area of a square is: "+(a*a));
	}
}
public class Area {
public static void main(String[] args) {
	
	new Square(4).getArea();
}
}
