package com.nit.Square_area;

class Shape1
{
	int a;
	public Shape1(int a)
	{
		this.a=a;
	}
}
  class Square1 extends Shape1
  {
	  public Square1(int s)
	  {
		  super(s);
	  }
	  public void getArea()
	  {
		  System.out.println("Area of Square is:"+(a*a));
	  }
  }
  class Rect extends Shape1
  {
	  int b;
	  public Rect(int length, int breadth)
	  {
		  super(length);
		  b=breadth;
	  }
	  public void getArea()
	  {
		  System.out.println("Area of Rectangle is: "+(a*b));
	  }
  }
    
public class Rectangle {
public static void main(String[] args) {
	new Square1(10).getArea();
	new Rect(20,8).getArea();
}
}
