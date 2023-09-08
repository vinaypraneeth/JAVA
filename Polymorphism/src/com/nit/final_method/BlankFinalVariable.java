package com.nit.final_method;

class Demo
{
	final int A;
	public Demo()
	{
		A=44;
		System.out.println(A);
	}
	public Demo(int x)
	{
		A=x;
		System.out.println(x);
	}
}
public class BlankFinalVariable {
	/*final int A;//Error
 public static void main(String[] args) {
	BlankFinalVariable fv=new BlankFinalVariable();
	System.out.println(fv.A);
}*/
	public static void main(String[] args) {
		Demo d1=new Demo();
		Demo  d2=new Demo(17);
	}
}
