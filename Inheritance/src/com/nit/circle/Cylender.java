package com.nit.circle;

public class Cylender extends Circle {
protected double height;
public Cylender() {}
public Cylender(double height,double radius)
{
	super(radius);
	this.height=height;
}
public double getVolume()
{
	if(radius<0)return -1;
	else return getArea()*height;
}
}
