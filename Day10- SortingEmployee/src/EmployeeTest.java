import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//import static java.awt.SequencedEvent.list;

/**
 * Created by kaurk on 7/22/2017.
 */
public class EmployeeTest {

    @Test
    public void locationComparator() {
        Comparator<Employee> compareEmployee = new EmployeeComparator();
        List<Employee> employees = employeeTest();
        Collections.sort(employees, compareEmployee);
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }


    class EmployeeComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {

            int v = (o1.getLocation().compareTo(o2.getLocation()));
            if (v != 0) {
                return v;
            }
            v = o1.getDeptName().compareToIgnoreCase(o2.getDeptName());
            if (v != 0) {
                return v;
            }
            v = o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
            if (v != 0) {
                return v;
            }
            v = o1.getLastName().compareToIgnoreCase(o2.getLastName());
            if (v != 0) {
                return v;
            }
            v = o1.getEmployeeId() - o2.getEmployeeId();
                return v;


        }}


        public static List<Employee> employeeTest() {
            List<Employee> list = new ArrayList<>();
            Employee e1 = new Employee("kamal", "jeet", "hr", 101, Enum.Pune);
            Employee e2 = new Employee("kanwal", "preet", "hr", 102, Enum.Hyderabad);
            Employee e3 = new Employee("jasneet", "kaur", "hr", 103, Enum.Pune);
            Employee e4 = new Employee("harsh", "kaur", "hr", 104, Enum.Pune);
            Employee e5 = new Employee("meeta", "sharma", "finance", 105, Enum.Pune);
            Employee e6 = new Employee("kamal", "preet", "finance", 106, Enum.Hyderabad);
            Employee e7 = new Employee("ram", "preet", "hr", 107, Enum.Pune);
            Employee e8 = new Employee("harleen", "kaur", "hr", 108, Enum.Pune);
            Employee e9 = new Employee("Manisha", "sharma", "finance", 109, Enum.Pune);
            Employee e10 = new Employee("karan", "preet", "hr", 110, Enum.Pune);
            Employee e11 = new Employee("kanwal", "preet", "hr", 111, Enum.Hyderabad);
            Employee e12 = new Employee("harnur", "preet", "hr", 112, Enum.Pune);
            Employee e13 = new Employee("nitesh", "sharma", "hr", 113, Enum.Pune);
            Employee e14 = new Employee("harkamal", "singh", "Rnd", 114, Enum.Pune);
            Employee e15 = new Employee("har", "preet", "hr", 95, Enum.Pune);
            Employee e16 = new Employee("kanwal", "preet", "hr", 94, Enum.Pune);
            Employee e17 = new Employee("kapil", "sharma", "hr", 93, Enum.Pune);
            Employee e18 = new Employee("raman", "preet", "Rnd", 92, Enum.Hyderabad);
            Employee e19 = new Employee("rajat", "preet", "hr", 91, Enum.Pune);
            Employee e20 = new Employee("raj", "kumar", "Rnd", 90, Enum.Pune);
            Employee e21 = new Employee("sham", "Sharma", "Rnd", 90, Enum.Pune);
            list.add(e1);
            list.add(e2);
            list.add(e3);
            list.add(e4);
            list.add(e5);
            list.add(e6);
            list.add(e7);
            list.add(e8);
            list.add(e9);
            list.add(e10);
            list.add(e11);
            list.add(e12);
            list.add(e13);
            list.add(e14);
            list.add(e15);
            list.add(e16);
            list.add(e17);
            list.add(e18);
            list.add(e19);
            list.add(e20);
            list.add(e21);
            return list;
        }

    }
