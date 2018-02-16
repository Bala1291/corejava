package com.prasanna;

public class Test5 {
	private static int i;

	public static void main(String[] args) {
		String a="abc";
		char c =a.charAt(2);
		System.out.println(c);//c
	System.out.println();
	
	int count=a.length();
	System.out.println(count);//3
	System.out.println();
	
	for(int i=0;i<count;i++)
	{
		System.out.print(a.charAt(i));//abc
	}
	System.out.println();
	
	for(i=count-1; i>=0;i--)
	{
	System.out.println(a.charAt(i));//bca
	
	System.out.println(a.indexOf("a"));//0
	}

	}

}
