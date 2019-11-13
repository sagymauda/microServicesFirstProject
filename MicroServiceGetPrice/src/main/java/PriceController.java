import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/price-serivce")
public class PriceController {

    @ResponseStatus(HttpStatus.OK)
    public int getPrice(){

        return PriceService.generateRandomPrice();
    }
}
