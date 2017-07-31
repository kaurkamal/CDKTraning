/**
 * Created by kaurk on 7/29/2017.
 */
public class Employee {
    int uid;
    String name;
    double salary;

    public Employee() {
    }

    public Employee(int uid, String name, double salary) {
        this.uid = uid;
        this.name = name;
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
}
