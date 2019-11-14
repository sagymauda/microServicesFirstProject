package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/uuid")
public class UUIDController {

    @Autowired
    UUIDService uuidService;
    @GetMapping
    public UUID getUUID()
    {
        return  uuidService.generateRandomUUID();
    }


}
