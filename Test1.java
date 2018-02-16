

package com.prasanna;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Employee {
    int empId;
    String name;
    float salary;
Employee(int empId, String name, float salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
}
@Override
public String toString() {
    return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary
            + "]";
}
}
class EmployeeIdComparetor implements Comparator {
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        if (e1.empId == e2.empId) {
            return 0;
        } else if (e1.empId > e2.empId) {
            return 1;
        } else {
            return -1;
        }
    }
}
class EmployeeNameComparator implements Comparator{
    public int compare(Object o1, Object o2) {
        Employee e1=(Employee)o1;
        Employee e2=(Employee)o2;
        return e1.name.compareTo(e2.name);
    }
}
public class Test1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(45, "ram", 6780);
     
        Employee e2 = new Employee(23, "yasir", 8767);
        Employee e3 = new Employee(90, "balu", 78);
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(e1);
        al.add(e2);
        al.add(e3);
        System.out.println(al);
        Collections.sort(al,new EmployeeIdComparetor());
        System.out.println(al);
        Collections.sort(al,new EmployeeNameComparator());
        System.out.println(al);
    }
}