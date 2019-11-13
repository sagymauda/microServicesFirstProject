import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PriceService {
    static int generateRandomPrice(){
        Random random = new Random();
        int price = random.nextInt(1000-1)+1;
        return price;
    }

}
