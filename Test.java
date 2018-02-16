package com.prasanna;
class A
{
	A(int a)
	{
		System.out.println("from A constructor");
	}
	void m1()
	{
		System.out.println("from m1");
	}
}
	class B extends A
	{
		B()
		{
		super(7);
	}
	}

public class Test {
	public static void main(String[] args) {
		A a=new B();
		a.m1();
	}
	}


