package javaCollection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by kaurk on 7/25/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        // Employee e[] = new Employee[];
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("kamal", 20000.0));
        list.add(new Employee("kanwal", 13000.0));
        list.add(new Employee("jassi", 14000.0));
        list.add(new Employee("harsh", 30000.0));
        list.add(new Employee("gurleen", 16000.0));
        list.add(new Employee("abhi", 12500.0));
        list.add(new Employee("ajay", 12800.0));
        list.add(new Employee("harnoor", 12900.0));
        list.add(new Employee("harleen", 12090.0));
        list.add(new Employee("harpreet", 12770.0));
        Iterator<Employee> it = list.iterator();
       while (it.hasNext()) {
            System.out.println("hra of employee : " + it.next().getName());
            System.out.println(it.next().getSalary() * 0.30);
        }
        Iterator<Employee> itr = list.iterator();
        System.out.println("2nd operation");
      Employee e = new Employee();
        while (itr.hasNext()){
            e = itr.next();
            double val = e.getSalary();
            if(val < 20000){
               e.setSalary(val+(val*0.20));
                System.out.println("updated salary : " + val);
            }
        }

    }
}
