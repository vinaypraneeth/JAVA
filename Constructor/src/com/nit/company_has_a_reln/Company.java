package com.nit.company_has_a_reln;

public class Company {
private String companyName;
private String companyLocation;
public Company(String companyName, String companyLocation)
{
	this.companyName=companyName;
	this.companyLocation=companyLocation;
}
@Override
public String toString() {
	return "Company [companyName=" + companyName + ", companyLocation=" + companyLocation + "]";
}
}
