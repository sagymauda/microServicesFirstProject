package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java. sql. Timestamp;
@Service
public class Ser{


        public String createName() {
            RestTemplate restTemplate = new RestTemplate();
            String nameResourceUrl="http://localhost:8081/name";
            ResponseEntity<String> response = restTemplate.getForEntity(nameResourceUrl,String.class);

            return response.getBody();
        }
        public UUID generateRandomUUID(){
            return UUID.randomUUID();
        }

        public int generateRandomPrice(){
            Random random = new Random();
            return random.nextInt(1000-1)+1;
        }
        public Date generateTimeStamp(){
            Date date = new Date();
            long time = date.getTime();
            return new Timestamp(time);
        }


}
