import java.io.Serializable;

/**
 * Created by kaurk on 7/28/2017.
 */
public class Employee implements Comparable<Employee>,Serializable {
    int uid;
    String name;
   transient double salary;

   @Override
   public int compareTo(Employee e) {
       if (this.uid == e.uid)
           return 0;
       else if (this.uid > e.uid) {
           return -1;
       }
       return 1;
   }

    public Employee(int uid, String name, double salary) {
        this.uid = uid;
        this.name = name;
        this.salary = salary;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
