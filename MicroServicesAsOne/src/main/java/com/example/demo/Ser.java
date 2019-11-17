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

//    private <T> micro(String url,Class<T> obj){
//          RestTemplate restTemplate = new RestTemplate();
//           String nameResourceUrl= url;
//           ResponseEntity<T>response = (ResponseEntity<T>) restTemplate.getForEntity(url,obj.getClass())
//        return  response.getBody();
//    }


        public String createName() {
            ResponseEntity<String> response = restTemplateUrl("http://localhost:8081/name").getForEntity("http://localhost:8081/name",String.class);

            return response.getBody();
        }
        public UUID generateRandomUUID(){
        ResponseEntity<UUID>response = restTemplateUrl("http://localhost:8082/uuid").getForEntity("http://localhost:8082/uuid",UUID.class);

            return response.getBody();
        }

        public Integer generateRandomPrice(){
        ResponseEntity<Integer> response = restTemplateUrl("http://localhost:8083/price").getForEntity("http://localhost:8083/price",Integer.class);

            return response.getBody();
        }
        public Date generateTimeStamp(){
           ResponseEntity<Date>response = restTemplateUrl("http://localhost:8084/timestemp").getForEntity("http://localhost:8084/timestemp",Date.class);

            return response.getBody();
        }


}
