package com.pras;
import java.io.*;  
class Serials{  
 public static void main(String args[])throws Exception{  
  Student s1 =new Student(210,"laxmi");  
  
  FileOutputStream fout=new FileOutputStream("t.txt");  
  ObjectOutputStream out=new ObjectOutputStream(fout);  
  
  out.writeObject(s1);  
  out.flush();  
  System.out.println("serialization success");  
 }  
}  