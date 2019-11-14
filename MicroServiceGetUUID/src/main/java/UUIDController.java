import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/uuid-service")
public class UUIDController {

    @Autowired
    UUIDService uuidService;

    @ResponseStatus(HttpStatus.OK)
    public UUID getUUID()
    {
        return  uuidService.generateRandomUUID();
    }


}
