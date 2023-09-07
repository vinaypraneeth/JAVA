package com.nit.soccer_may_1;

public class Soccer2 extends Sports2 {
    static String s1;
	@Override
	public String getName(String s) {
		s1=s;
		return super.getName(s);
	}

	@Override
	public String getNumberOfTeamMembers()
	{
		return this.getName(s1)+" "+"Each team has 11 players";
	}

}
