package com.nit.method_chaining;

public class Test {
    public static void main(String[] args) {
		String str="India";
		int x=str.toUpperCase().concat(" is great").length();
		System.out.println(x);
		System.out.println(str.getClass().getName());
	}
}
