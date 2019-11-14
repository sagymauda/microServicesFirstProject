import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/timestemp-service")
public class TimeStempController {
    @Autowired
    TimeStempService timeStempService;


    public Date getTimeStamp() {

        return   timeStempService.generateTimeStamp();
    }

}
