package SerializaçãoemJSONAPIJackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public final class JacksonUtils {

    private static final ObjectMapper objectMapper;

    static {
        objectMapper = new ObjectMapper();
        objectMapper().registerModule(new JavaTimeModule());
    }

    private JacksonUtils(){

    }


    public static ObjectMapper objectMapper(){
        return objectMapper;
    }

}
