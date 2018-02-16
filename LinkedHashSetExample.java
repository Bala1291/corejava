
 //Example of LinkedHashSet example



package com.SET;

import java.util.LinkedHashSet;

public class LinkedHashSetExample
{
    public static void main(String[] args)
    {
        //Creating LinkedHashSet
 
        LinkedHashSet<String> set = new LinkedHashSet<String>();
 
        //Adding elements to LinkedHashSet
 
        set.add("JAVA");
 
        set.add("J2EE");
 
        set.add("STRUTS");
 
        set.add("JSP");
 
        set.add("JDBC");
 
        set.add("HIBERNATE");
        set.add(null);
        set.add(null);
 
        //Printing elements of LinkedHashSet
 
        System.out.println(set);     
 
        //Output : [JAVA, J2EE, STRUTS, JSP, JDBC, HIBERNATE]
 
        //Notice the order of elements. They are placed according to their insertion order.
    }
}