import org.springframework.stereotype.Service;

import java.util.Random;
@Service
public class NameService {

    static String createName() {
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
}
