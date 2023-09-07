package com.nit.circle;

public class ShapeTester {
public static void main(String[] args) {
	double area = new Cylender(5,4).getArea();
	double volume = new Cylender(5,4).getVolume();
	System.out.println(area+"\n"+volume);
}
}
