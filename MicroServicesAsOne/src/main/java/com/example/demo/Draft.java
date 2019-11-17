package com.example.demo;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Draft implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        String nameResourceUrl="http://localhost:8081/name";
        ResponseEntity<String> response = restTemplate.getForEntity(nameResourceUrl,String.class);
        System.out.println(response.getBody());
        System.out.println("hello shahaf");
    }
}
