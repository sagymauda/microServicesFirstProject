package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class Controller {

    @Autowired
    Ser ser;

    @GetMapping
    public Person getPerson(){
        Person person = new Person();
        person.setName(ser.createName());
        person.setPrice( ser.generateRandomPrice());
        person.setUuid(ser.generateRandomUUID());
        person.setTimeStemp(ser.generateTimeStamp());
        return person;
    }


}
