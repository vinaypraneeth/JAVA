package com.nit.soccer_may_1;

public class Test {
public static void main(String[] args) {
	Soccer sc= new Soccer();
	sc.setSportName("cricket");
	sc.setNumberOfTeamMembers(11);
	
	System.out.println(sc.getName()+"\n"+sc.getNumberOfTeamMembers());
}
}
