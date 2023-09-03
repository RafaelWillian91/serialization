package SerializaçãoemJSONAPIJackson.DesserializandoArquivoJson;

import SerializaçãoemJSONAPIJackson.JacksonUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class App6 {

    public static void main(String[] args) throws Exception{

        ObjectMapper jsonObject = JacksonUtils.objectMapper();

        try (InputStream s = Files.newInputStream(Path.of( "C:\\Users\\rafaw\\IdeaProjects\\serialization\\src\\SerializaçãoemJSONAPIJackson\\DesserializandoArquivoJson\\ArqJson.Json"))) {

           // var letters = jsonObject.readValue(s , List.class);
//          //  var letters = jsonObject.readValue(s, new TypeReference<List<String>>() {
//            });
            // var letters = jsonObject.readValue(Files.newInputStream(Path.of("ArqJson.json")), List.class);

            var letters = jsonObject.readValue(s, String[].class);
            System.out.println(letters[2]);
        }






    }
}
