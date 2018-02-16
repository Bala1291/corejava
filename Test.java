package com.prasanna;

class A {
	int b=20;
	String ename;

	void display() {
		System.out.println(b);
		System.out.println(ename);
	}
	void doget()
	{
		b=10;
		ename="prasanna";
	}
}

public class Test {

	public static void main(String[] args) {
		A a = new A();
		a.display();

	}

}