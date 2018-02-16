package com.prasanna;
class Father
{
	float property=4000;
	String homeneme="prasanna nilayam";
	void m1()
	{
		System.out.println(property);
		System.out.println("homename");
	}
}
class Son extends Father
{
	
}

public class Testtt {
	public static void main(String[] args) {
		Son c=new Son();
		c.m1();
	}

}
