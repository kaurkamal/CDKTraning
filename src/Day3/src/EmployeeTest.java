import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by kaurk on 7/18/2017.
 */
public class EmployeeTest {

    public static void main(String[] args) {
        List<Employee> list = createEmployee();
        for (Employee e:list) {
            System.out.println(e.toString());

        }

    }
    public static List<Employee> createEmployee(){
        Employee e1 = new Employee(1,"Kamal",new Date(1995-1900,7-1,19),new Date(2017,7,7),Location.Hyderabad);
        Employee e2 = new Employee(2,"kanwal",new Date(1994-1900,8-1,8),new Date(2016,8,9),Location.Pune);
        Employee e3 = new Employee(3,"harsh",new Date(1994-1900,9-1,7),new Date(2014,8,9),Location.Pune);

         List a = new ArrayList();
        a.add(e1);
        a.add(e2);
        a.add(e3);
        return a;
    }

}
