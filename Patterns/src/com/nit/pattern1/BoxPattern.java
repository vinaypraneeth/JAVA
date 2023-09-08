package com.nit.pattern1;

public class BoxPattern {
public static String createBoxPatttern(int row,int col)
{
	String res="";
	if(row<0||col<0)return ""+-1;
	else if(row==0||col==0)return ""+-2;
	else {
		for(int i=0;i<row;i++)
	   {
		for(int j=0;j<col;j++)
		{
			
			if(i==0||i==row-1||j==0||j==col-1)res=res+"*";
			else res=res+" ";
			
		}
		res=res+"\n";
	}
	return res;
}
}
}
