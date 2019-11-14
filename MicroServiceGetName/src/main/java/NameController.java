import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name-service")
public class NameController {
    @Autowired
    NameService nameService;

 @ResponseStatus(HttpStatus.OK)
    public String getName(){

       return   NameService.createName();
    }

}
