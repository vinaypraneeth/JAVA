package com.nit.pattern1;

public class Pattern2 {
public static String NumberPattern(int row)
{
	String  res="";
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=i;j++)
		{
			res=res+" "+(j*i)+" ";
		}
		res=res+"\n";
	}
	return res;
}
}
