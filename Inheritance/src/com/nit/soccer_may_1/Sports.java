package com.nit.soccer_may_1;

public class Sports {
	private int numberOfTeamMembers;
	private String sportName;
public String getName()
{
	return "In "+sportName;
}
public void setSportName(String sportName)
{
	this.sportName=sportName;
}
public String getNumberOfTeamMembers()
{
	return "Each team has "+numberOfTeamMembers+" players in "+this.sportName;
}
public void setNumberOfTeamMembers(int n)
{
	numberOfTeamMembers=n;
}
}
