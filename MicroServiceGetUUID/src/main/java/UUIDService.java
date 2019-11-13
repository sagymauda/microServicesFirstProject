import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UUIDService {
    static UUID generateRandomUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid;
    }
}
