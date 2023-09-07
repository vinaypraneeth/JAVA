package com.nit.circle;

public class Circle {
protected double radius;
final double PI=3.14;
public Circle()
{
}
public Circle(double radius)
{
	this.radius=radius;
}
public double getArea()
{
   if(radius<0)return -1;
   else return PI*radius*radius;
}
}
