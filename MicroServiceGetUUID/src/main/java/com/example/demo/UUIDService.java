package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UUIDService {
    public UUID generateRandomUUID(){
        return UUID.randomUUID();
    }
}
