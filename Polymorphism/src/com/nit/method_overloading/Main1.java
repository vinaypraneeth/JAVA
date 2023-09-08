package com.nit.method_overloading;

public class Main1 {
public static void main(String[] args) {
	Test1 t=new Test1();
	t.acceptData();
	t.acceptData(17,44);
	t.acceptData(11,15,17);
	t.acceptData(11,15,17,27,30);
	t.acceptData(11,17,27,30,46);
}
}
