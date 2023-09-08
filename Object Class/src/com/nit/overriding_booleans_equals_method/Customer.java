package com.nit.overriding_booleans_equals_method;

public class Customer {
  private Integer customerId;
  private String customerName;
    public Customer(Integer customerId, String customerName)
    {
    	super();
    	this.customerId=customerId;
    	this.customerName=customerName;
    }
    
    @Override
    public boolean equals(Object obj)
    {
    	if(obj instanceof Customer)
    	{
    		Customer c2=(Customer)obj;
    		if(this.customerId==c2.customerId && this.customerName.equalsIgnoreCase(c2.customerName))
    		{
    			return true;
    		}
    		else 
    		{
    			return false;
    		}
    	}
    	else 
    	{
    		return false;
    	}
    }
}
class Student
{
	private Integer studentId;
	private String studentName;
	
	public Student(Integer studentId, String studentName)
	{
		super();
		this.studentId=studentId;
		this.studentName=studentName;
	}
	
}
