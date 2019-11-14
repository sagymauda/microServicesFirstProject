package com.example.demo;

import lombok.Data;

import java.util.Date;
import java.util.UUID;
@Data
public class Person {
    String name ;
    UUID uuid;
    Date timeStemp;
    Integer price;


}
