package com.nit.co_variant;

class Base
{
	public void show()
	{
		System.out.println("Super class show method..");
	}
}
class Derived extends Base
{
	@Override
	  public void show()//public int show()
	{
		System.out.println("sub class show method..");
	//	return 0;
	}
}

public class CoVariant {
      public static void main(String[] args) {
		Base b=new Derived();
		b.show();
	}
}
