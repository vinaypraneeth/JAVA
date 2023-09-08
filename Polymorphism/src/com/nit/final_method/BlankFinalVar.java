package com.nit.final_method;

public class BlankFinalVar {
	final int A;
	public BlankFinalVar()
	{
		A=010;
		System.out.print(A);
	}
	public BlankFinalVar(int x)
	{
		A=x;
		System.out.println("/"+A);
	}
	public static void main(String[] args) {
		BlankFinalVar fv=new BlankFinalVar();
		//System.out.println(fv);
		BlankFinalVar fv1=new BlankFinalVar(20);
		//System.out.println(fv1);
	}

}
