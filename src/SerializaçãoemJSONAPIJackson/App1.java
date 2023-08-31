package SerializaçãoemJSONAPIJackson;

import SerializacaocomAPInativaJava.aula01Serialization.Client;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.time.LocalDate;

public class App1 {

    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        Client c1 = new Client(1231, "Rafael Willian", LocalDate.of(1991, 03, 25), "47349724");

        String json = objectMapper.writeValueAsString(c1);

        System.out.println(json);
    }
}
