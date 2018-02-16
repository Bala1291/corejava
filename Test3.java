package com.prasanna;
class A1
{
	int num;
	String name;
	void m1()
	{
		num=10;
		name="pra";
		}
	void m2()
	{
		System.out.println(num);
		System.out.println(name);
	}
}

public class Test3 {
	public static void main(String[] args) {
		A1 a=new A1();
		a.m1();
		a.m2();
		
	}
}
	
