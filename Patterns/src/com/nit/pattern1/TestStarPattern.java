package com.nit.pattern1;

import java.util.Scanner;

public class TestStarPattern {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter no of rows");
	int row = sc.nextInt();
	String starPattern=StarPattern.createStarPattern(row);
	System.out.println(starPattern);
	sc.close();
}
}
