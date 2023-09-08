package com.nit.pattern1;

public class StarPattern {
public static String createStarPattern(int row)
{
	String res="";
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<=i;j++)
		{
		     res=res+" * ";
		}
		res=res+"\n";
	}
	return res;
}
}
