package serializationUtils;

import aula01Serialization.Client;

import java.nio.file.Path;
import java.time.LocalDate;

import static serializationUtils.SerializationUtils.*;

public class Clienteapp3 {


    public static void main(String[] args) {

        Path p1 = Path.of("fileUtils.bin");
        //Client c1 = new Client(21, "Josiane", LocalDate.of(1991, 8, 03), "39418668858");

       // toFile(c1, p1);

        Client c2 = fromFile(p1);
        System.out.println("Desserializado: " + c2);















    }
}
