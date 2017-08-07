package com.example.controller;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Car {

    int  vin;
    String model;
    String make;
    double price;
    int qty;
    public Car(){}

    public Car(int vin, String model, String make, double price, int qty) {
        this.vin = vin;
        this.model = model;
        this.make = make;
        this.price = price;
        this.qty = qty;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin=" + vin +
                ", model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (vin != car.vin) return false;
        if (Double.compare(car.price, price) != 0) return false;
        if (qty != car.qty) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        return make != null ? make.equals(car.make) : car.make == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = vin;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (make != null ? make.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + qty;
        return result;
    }
}
