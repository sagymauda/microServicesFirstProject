package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java. sql. Timestamp;
@Service
public class Ser{


        public String createName() {
            Random random = new Random();
            int num =random.nextInt(10 - 2)+ 1;
            String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                    + "abcdefghijklmnopqrstuvxyz";

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < num; i++) {
                int index
                        = (int)(AlphaNumericString.length()
                        * Math.random());

                sb.append(AlphaNumericString
                        .charAt(index));
            }
            return sb.toString();
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
