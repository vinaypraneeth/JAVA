 package com.nit.student;

//import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	//Scanner sc= new Scanner(System.in);
	
	DayScholar d=new DayScholar(444,"Rakesh",800,10000);
    double payFee = d.payFee(5000);
    System.out.println(d+"\nexcessAmount/DueAmount="+payFee);
    
    System.out.println("---------------------------------------");
    
    Hosteller h=new Hosteller(417,"Nikhi",800,30000);
    double payFee2 = h.payFee(25000);
    System.out.println(h+"\nexcessAmount/DueAmount="+payFee2);
    
}
}
