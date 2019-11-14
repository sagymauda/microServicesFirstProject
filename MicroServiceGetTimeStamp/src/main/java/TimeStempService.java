import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;

@Service
public class TimeStempService {
    public  Date generateTimeStamp(){
        Date date = new Date();
        long time = date.getTime();
        return new Timestamp(time);
    }
}
