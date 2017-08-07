package org.cdk.annotation;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("101")
     int id;
    @Value("Kamaljeet")
     String name;
     //String phone;
     public Employee(){}



    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
   /* public Employee(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
