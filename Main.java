package com.prasanna;
class A
{
	void m1()
	{
		System.out.println("from this method");
	}
	void m2(int a)
	{
		System.out.println("from second");
	}
	void m3(int a,int b,int c)
	{System.out.println("from third");
}
}
public class Main {
public static void main(String[] args) {
	A a=new A();
	a.m2(5);//FROM SECOND
	a.m1();//from this method
	
}
}
