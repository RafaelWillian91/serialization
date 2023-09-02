package SerializaçãoemJSONAPIJackson.DesserializacaoComTypeReference;

import SerializaçãoemJSONAPIJackson.DeserializandoJackson.App4;
import SerializaçãoemJSONAPIJackson.JacksonUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class App5 {

    public static void main(String[] args) throws Exception{

        String json = """
                { "min": 5, "max": 10}
                 """;
        ObjectMapper objectMapper = JacksonUtils.objectMapper();
        Map<String, Integer> r2 = objectMapper.readValue(json, Map.class);

        //new TypeReference<Map<String, Integer>>(){};

        //TypeReference é particularmente útil quando você lida com tipos genéricos, como listas,
        // mapas ou qualquer outra estrutura de dados parametrizada.
        // Ele ajuda a manter a segurança de tipos durante a desserialização de JSON em tipos genéricos em Java.
        //Usar List.class não é a abordagem recomendada quando se trabalha com tipos genéricos, pois compromete
        // a segurança de tipo e pode levar a problemas em tempo de execução
        var jsonType =  objectMapper.readValue(json, new TypeReference<Map<String, Integer>>(){});
        System.out.println(jsonType);
        System.out.println(json);

    }

    private record Range(int min, int max){}
}
