package com.prasanna;
class Person
{
	int id;
	String name;
	void m1()
	{
	id=11;
	name="ddd";
	}
	void m2()
	{
		System.out.println(id);
		System.out.println(name);
		
	}
}
public class Testtt {
	public static void main(String[] args) {
		Person p=new Person();
		p.m1();
		p.m2();
	}
	

}
