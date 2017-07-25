package javaCollection;

/**
 * Created by kaurk on 7/25/2017.
 */
public class Employee {
  private   String name;
   private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
