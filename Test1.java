package com.SET;

import java.util.HashSet;
import java.util.Iterator;

class Student
{
    String name;
 
    int rollNo;
 
    String department;
 
    public Student(String name, int rollNo, String department)
    {
        this.name = name;
 
        this.rollNo = rollNo;
 
        this.department = department;
    }
 
    @Override
    public int hashCode()
    {
        return rollNo;
    }
 
    @Override
    public boolean equals(Object obj)
    {
        Student student = (Student) obj;
 
        return (rollNo == student.rollNo);
    }
 
    @Override
    public String toString()
    {
        return rollNo+", "+name+", "+department;
    }
}
 
public class Test1
{
    public static void main(String[] args)
    {
        HashSet<Student> set = new HashSet<Student>();
 
        //Adding elements to HashSet
 
        set.add(new Student("Avinash", 121, "ECE"));
 
        set.add(new Student("Bharat", 101, "EEE"));
 
        set.add(new Student("Bharat", 301, "IT"));
 
        set.add(new Student("Amit", 301, "IT"));           //duplicate element
 
        set.add(new Student("Bhavya", 872, "ECE"));
 
        //Iterating through HashSet
 
        Iterator<Student> it = set.iterator();
 
        while (it.hasNext())
        {
            Student student = (Student) it.next();
 
            System.out.println(student);
        }
    }
}