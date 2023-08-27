package SerializacaocomAPInativaJava.exercicio;

import SerializacaocomAPInativaJava.serializationUtils.SerializationUtils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ex01 {

    public static void main(String[] args) {

        Path p2 = Path.of("numbers.out");

        List<Double> numbers = new ArrayList<>();

        if(Files.exists(p2)){
            numbers = SerializationUtils.fromFile(p2);
        }

        numbers.add(Math.random());
        SerializationUtils.toFile(numbers, p2);

        numbers.forEach(System.out::println);

    }
}
