package com.SET;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(null);
		h.add(null);//doesnot allow null values
		h.add(1);
		h.add("balu");
		h.add("prasad");//doesnot allow duplicates
		h.add("bindu");
		h.add("swamy");
		h.add("goud");
		h.add("zebra");
		System.out.println(h);
	}
}
