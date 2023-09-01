package SerializaçãoemJSONAPIJackson.SerializacaoItem;

import SerializaçãoemJSONAPIJackson.JacksonUtils;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.List;

public class App3 {

    public static void main(String[] args) throws Exception {

        ObjectMapper objectMapper1 = JacksonUtils.objectMapper();
        Item item1 = new Item(34, "Sabonete");
        Item item2 = new Item(24, "Shampoo");
        Item item3 = new Item(14, "Cotonete");

        List list = List.of(item1, item2, item3);

        String json = objectMapper1.writeValueAsString(list);

        System.out.println(json);


        try(OutputStream o1 = new FileOutputStream("arquivojackson.json")) {

            objectMapper1.writeValue(o1, list);

        }

    }
}
