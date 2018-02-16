package com.prasanna;
class AB
{
	//instance variable
	int id;
	String name;
	AB(int id,String name)
	{
		//localvariables
		this.id=id;
		this.name=name;
		this.getdata();
	}
	void display()
	{
		System.out.println(id);
		System.out.println(name);
	}
	void getdata()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
}


public class Person {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AB a=new AB(10,"pra");
a.display();
	}
}
