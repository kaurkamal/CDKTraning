package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@RestController
public class CarResourceController {
    @Autowired
    CarDao carDao;

   /* @RequestMapping(value = "car",produces = "text/plain",method = RequestMethod.GET)
    public String readCar(){
        return "vin-100,model-Q7,make-audi,Price-780000000.0,qty-6";
    }
    @RequestMapping(value = "car",produces = APPLICATION_JSON_VALUE ,method = RequestMethod.GET)
    public String readCarAsJson(){
        return "{\"vin\":100,\"model\":\"Q7\",\"make\":\"audi\",\"Price\":780000000.0,\"qty\":6}";
    }*/
    @RequestMapping(value = "car",produces = APPLICATION_XML_VALUE,method = RequestMethod.GET)
    public Car readCarAsXml(){
        //return "<id>vin-100</id>,<model>model-Q7</model>,<make>make-audi</make>,<price>Price-780000000.0</price>,<qty>qty-6</qty>";
          Car car = carDao.selectByVin(101);
          return car;
    }
}
