package com.nit.method_overloading;

public class AmbiguityTest {
public static void main(String[] args) {
	Ambiguity a=new Ambiguity();
	a.accept("Rakesh");
	a.accept(null);
}
}
