package com.prasanna;

import java.io.IOException;

class S
{
	void m1() throws IOException
	{
	System.out.println("parent");
	}
}
	class B extends S
	{
		void m1() throws ArithmeticException,NullPointerException
		{System.out.println("child");
	}
	}
	
public class Test2 {
public static void main(String[] args) throws Exception {
	//S s=new S();//it will print parent
	B b=new B();
	//B b=new S();//COMPILE TIME ERROR
	//S s=new B();//child it will come output.
	b.m1();
}
	
}

