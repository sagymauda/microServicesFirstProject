import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    Ser ser;

    @GetMapping("/name")
    public String getName(){
       return  ser.createName();
    }

    @GetMapping("/uuid")
    public UUID getUUID(){
        return  ser.generateRandomUUID();
    }

    @GetMapping("/price")
    public Integer getPrice(){
        return ser.generateRandomPrice();
    }

    @GetMapping(value = "/date")
    public Date getTimeStamp() {
      return   ser.generateTimeStamp();
    }


    public static void main(String[] args) {

    }
}
