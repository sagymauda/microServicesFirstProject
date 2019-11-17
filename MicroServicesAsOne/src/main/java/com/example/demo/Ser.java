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

    private RestTemplate restTemplateUrl(String url){
          RestTemplate restTemplate = new RestTemplate();
           String nameResourceUrl= url;
           return  restTemplate;
    }


        public String createName() {
            ResponseEntity<String> response = restTemplateUrl("http://localhost:8081/name").getForEntity("http://localhost:8081/name",String.class);

            return response.getBody();
        }
        public UUID generateRandomUUID(){
        ResponseEntity<UUID>response = restTemplateUrl("http://localhost:8082name").getForEntity("http://localhost:8082/name",UUID.class);

            return response.getBody();
        }

        public Integer generateRandomPrice(){
        ResponseEntity<Integer> response = restTemplateUrl("http://localhost:8083/name").getForEntity("http://localhost:8083/name",Integer.class);

            return response.getBody();
        }
        public Date generateTimeStamp(){
           ResponseEntity<Date>response = restTemplateUrl("http://localhost:8084/name").getForEntity("http://localhost:8083/name",Date.class);

            return response.getBody();
        }


}
