package com.nit.pattern1;

import java.util.Scanner;

public class TestBoxPattern {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter rows and cols: ");
  int row = sc.nextInt();
  int col=sc.nextInt();
  String pattern = BoxPattern.createBoxPatttern(row, col);
  System.out.println(pattern);
  sc.close();
}
}
