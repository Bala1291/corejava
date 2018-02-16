package com.prasanna;
class A
{
	int id;
	String name;
void m1(int id,String name){
	this.id=id;
	this.name=name;	
}
void m2()
{
	System.out.println(id);
	System.out.println(name);
}
}

public class Tesss {
	public static void main(String[] args) {
		A a=new A();
		a.m1(111,"love");
		a.m2();
	}

}
