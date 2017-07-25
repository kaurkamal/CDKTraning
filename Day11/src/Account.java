import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by kaurk on 7/25/2017.
 */
public class Account {
    static public void updateSalary(EmployeeService emp, Double salary){
        emp.setSalary(salary);
        System.out.println("new salary is : " + emp.getSalary());
    }
    static public double calculateTDS(EmployeeService emp){
        return (emp.getSalary()*0.18);
    }

}
