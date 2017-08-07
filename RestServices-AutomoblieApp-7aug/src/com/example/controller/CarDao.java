package com.example.controller;

import org.springframework.stereotype.Repository;

@Repository
public class CarDao {
    public Car selectByVin (int vin){
        //jdbc logic
        return new Car(101,"x5","bmw",8800000.0,10);
    }
}
