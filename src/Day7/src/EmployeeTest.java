import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;

import java.util.*;

/**
 * Created by kaurk on 7/18/2017.
 */
public class EmployeeTest {

    /*public static void main(String[] args) {
        //for createEmployee
        List<Employee> list = createEmployee();
        for (Employee e:list) {
            System.out.println(e.toString());

        }*/

       //Formyutil
      /*  Employee[] emp = new Employee[3];


        emp[0] = new Employee(3,"Kamal",new Date(1995-1900,7-1,19),new Date(2017,7,7),Location.Hyderabad);
        emp[1] = new Employee(1,"kanwal",new Date(1994-1900,8-1,8),new Date(2016,8,9),Location.Pune);
        emp[2] = new Employee(2,"harsh",new Date(1994-1900,9-1,7),new Date(2014,8,9),Location.Pune);
        MyUtil.sort(emp, new InterfaceImplementation());
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);

    } }*/

      //logic in same place for same data
      @Test
      public void testInterfaceSort(){
          //Comparator<Employee> compareIds = new IDComparator();
          List<Employee> employees = createEmployee();
          Collections.sort(employees, new IntComparator(new IdExtractor()));
          for(Employee emp : employees){
              System.out.println(emp);
          }

      }

    interface Extractor {
      public int extractInt(Employee e);
       }
       class IdExtractor implements Extractor {
      @Override
           public int extractInt(Employee e){
          return e.getEmployeeId();
      }
       }

       class IntComparator implements Comparator<Employee> {
           private Extractor ext;
           public IntComparator(Extractor ext) {
               this.ext = ext;
           }
           @Override
           public int compare(Employee o1, Employee o2) {
               return ext.extractInt(o1) - ext.extractInt(o2);
           }
       }
    //simple use of sorting one by one
      @Test
      public void testSort(){
          Comparator<Employee> compareIds = new IDComparator();
              List<Employee> employees = createEmployee();
              Collections.sort(employees, compareIds);
              for(Employee emp : employees){
                  System.out.println(emp);
              }

          }
          @Test
      public void testDeptSort(){
          Comparator<Employee> comparedept = new DeptIDComparator();
              List<Employee> employees = createEmployee();
              Collections.sort(employees, comparedept);
              for(Employee emp : employees){
                  System.out.println(emp);
              }

          }

      class IDComparator implements Comparator<Employee> {
           @Override
          public int compare(Employee o1, Employee o2){
               //logic
               return (o1.getEmployeeId() - o2.getEmployeeId());
           }
      }
      class DeptIDComparator implements Comparator<Employee> {
           @Override
          public int compare(Employee o1, Employee o2){
               //logic
               return (o1.getdeptId() - o2.getdeptId());
           }
      }




    public static List<Employee> createEmployee(){
      Employee e1 = new Employee(2,101,"Kamal",new Date(1995-1900,7-1,19),new Date(2017,7,7),Location.Hyderabad);
        Employee e2 = new Employee(1,100,"kanwal",new Date(1994-1900,8-1,8),new Date(2016,8,9),Location.Pune);
        Employee e3 = new Employee(3,104,"harsh",new Date(1994-1900,9-1,7),new Date(2014,8,9),Location.Pune);

        List a = new ArrayList();
        a.add(e1);
        a.add(e2);
        a.add(e3);
        return a;
       /* Employee e4 = new Employee("Harsh","Singh");
        Employee e5 = new Employee("jasneet", "kaur");
        Employee e6 = new Employee("Manisha","Sharma");
        List a = new ArrayList();
        a.add(e4);
        a.add(e5);
        a.add(e6);
        return a; */
    }

}
