

import java.util.SortedSet;
import java.util.TreeSet;

class Employee implements Comparable {
    int empId;
    String name;

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public String toString() {
        return empId + "-" + name;
    }

    public int compareTo(Object obj) {
        Employee e = (Employee) obj;
        
        if (this.empId == e.empId) {
            return 0;
        } else if (this.empId > e.empId) {
            return 1;
        } else {
            return -1;
        }
    }
}
public class Test1 {
    public static void main(String[] args) {
        SortedSet st = new TreeSet();
        Employee e1 = new Employee(12, "abc");
        Employee e2 = new Employee(4, "hhh");
        Employee e3 = new Employee(1, "ram");
        st.add(e1);
        st.add(e2);
        st.add(e3);
        System.out.println(st);

    }

}
