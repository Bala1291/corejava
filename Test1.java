package com.pra;


class A
{
 A(float f,int b) {
	System.out.println("from b constructor");
 }
}
class B extends A
{
	B()
	{
	super(50,10);
	System.out.println("FROM C CONSTRICTOR");
	}
}

public class Test1 {
	public static void main(String[] args) {
		A a=new B();
	}
	}