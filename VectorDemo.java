package com.List;

import java.util.Vector;

public class VectorDemo {
public static void main(String args[]){      
Vector<String> v=new Vector<String>();//creating vector  
	v.add("umesh");//method of Collection  
	v.addElement("irfan");//method of Vector  
    v.addElement("kumar");
    v.addElement(null);
    v.addElement(null);
    v.addElement(null);
    
		  System.out.println(v);
}
}