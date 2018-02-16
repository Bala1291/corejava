package com.prasanna;
//based on key sorting order
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
public class Test2 {
	public static void main(String[] args) {
		Map m=new HashMap();
		m.put("sachin",20);
		m.put("gangoli",30);
		m.put("pras",40);
		Set s=m.keySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Object obj=(Object)itr.next();
			System.out.println(obj);
		}
	}
}
