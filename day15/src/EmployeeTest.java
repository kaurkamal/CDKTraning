import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static sun.plugin2.main.client.ServiceDelegate.get;

/**
 * Created by kaurk on 7/29/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employeesList = Arrays.asList(
                new Employee(101, "kamal", 20000),
                new Employee(102, "kanwal", 40000),
                new Employee(111, "harsh", 23000),
                new Employee(131, "jassi", 20400),
                new Employee(141, "haeleen", 40000),
                new Employee(151, "arshi", 58000),
                new Employee(171, "sneh", 45000),
                new Employee(191, "snigdha", 33000),
                new Employee(181, "karan", 22000),
                new Employee(121, "arjun", 34000),
                new Employee(109, "maya", 55000),
                new Employee(108, "manisha", 25000),
                new Employee(104, "harry", 23000),
                new Employee(105, "jerry", 80000),
                new Employee(1078, "berry", 14000),
                new Employee(1011, "gagan", 10000)
        );
        Double result = employeesList.stream().filter((emp) -> emp.getSalary() > 50000).map((emp) -> emp.getSalary() * 0.10).reduce((a, b) -> a + b).get();
        System.out.println("after manimulation and reducing result : " + result);


        Double result2 = employeesList.stream().map((emp) -> emp.getSalary()).reduce((a, b) -> a + b).map((sum) -> sum / 16).get();
        System.out.println("Average salary : " + result2);

        Double result3 = employeesList.stream().collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println("total salary is : " + result3);

        long count = employeesList.stream().collect(Collectors.counting());
        System.out.println("no of employees are : " + count);

        Optional<Employee> maxSal = employeesList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println(" Employee with maximum salary is " + maxSal.get());

        Optional<Employee> minSal = employeesList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Employee with minimum salary is " + minSal.get());

    }
}
