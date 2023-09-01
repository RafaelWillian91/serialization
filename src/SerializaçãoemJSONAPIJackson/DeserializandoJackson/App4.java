package SerializaçãoemJSONAPIJackson.DeserializandoJackson;

import SerializaçãoemJSONAPIJackson.JacksonUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.w3c.dom.ranges.Range;

import java.io.IOException;
import java.util.Random;

public class App4 {

    public static void main(String[] args) throws IOException {

        String json = """
                { "min": 5, "max": 10 }
                 """;
        ObjectMapper objectMapper = JacksonUtils.objectMapper();
        Range r1 = objectMapper.readValue(json, Range.class);
        System.out.println(json);
        System.out.println(r1);
    }


    private record Range(int min, int max){}


}