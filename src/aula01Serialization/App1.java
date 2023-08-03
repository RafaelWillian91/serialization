package aula01Serialization;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class App1 {


    public static void main(String[] args) throws IOException {

        Client c1 = new Client(1, "Pedro", LocalDate.of(2020, 03, 25));
        System.out.println(c1);

        Path p1 = Paths.get("C:\\Users\\rafaw\\OneDrive\\Documentos\\myOutJava\\file.bin");

        //This is a class in use to serialization java objects into output streams
        //widely used for data persistence
        //Files.newOutputStream(). This is a method offers a more flexible and modern to create an OutputStream
        ObjectOutputStream objStream = new ObjectOutputStream(Files.newOutputStream(p1));
        objStream.writeObject(c1);


    }
}
