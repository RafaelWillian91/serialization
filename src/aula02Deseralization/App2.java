package aula02Deseralization;

import aula01Serialization.Client;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class App2 {


    public static void main(String[] args) throws IOException {

        Path path = Path.of( "src","resources", "file.bin");
        System.out.println(path.toAbsolutePath());

        try (ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path))){
            Client c1 = (Client) objectInputStream.readObject();
            System.out.println(c1);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
