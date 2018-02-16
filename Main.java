

package com.prasanna;
 class Employee
 {
	 int id;
	 public void setid(int id)
	 {
		 this.id=id;
	 }
	 public int getid(int id)
	 {
		 return id;
	 }
 }

public class Main {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setid(10);
		System.out.println(e.getid(10));
		
	}
}