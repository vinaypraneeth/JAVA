package com.nit.pattern1;

public class NumberPattern {
public static String numberPattern(int row)
{
	String res="";
	int a=0;
	for(int i=1;i<=row;i++)
	{
		a=i;
		for(int j=1;j<=i;j++)
		{
			
			res=res+" "+(a++)+" ";
		}
		res=res+"\n";
	}
	return res;
}
}
