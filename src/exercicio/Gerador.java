package exercicio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Gerador {

    private static final Path p1 = Path.of("generate.bin");

    public static void Generated(double number){

        List<Double> list = arqGenerator();
        list.add(number);
        if(Files.exists(p1)) {
                try (ObjectOutputStream obj = new ObjectOutputStream(Files.newOutputStream(p1))) {
           // try (ObjectOutputStream obj = new ObjectOutputStream(new BufferedOutputStream(Files.newOutputStream(p1, StandardOpenOption.CREATE, StandardOpenOption.APPEND)))) {
                    obj.writeObject(list);
                    System.out.println("criado com sucesso");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static List<Double> arqGenerator() {

        List<Double> list = new ArrayList<>();


        try (ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(p1))) {

            return (List<Double>) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
