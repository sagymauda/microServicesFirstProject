import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/timestemp-service")
public class TimeStempController {
    @ResponseStatus(HttpStatus.OK)
    public Date getTimeStamp() {
        return   TimeStempService.generateTimeStamp();
    }

}
