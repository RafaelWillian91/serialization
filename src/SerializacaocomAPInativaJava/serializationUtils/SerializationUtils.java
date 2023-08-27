package SerializacaocomAPInativaJava.serializationUtils;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public final class SerializationUtils {

    private SerializationUtils() {
    }

    public static void toFile(Object obj, Path file) {

        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(file))) {
            oos.writeObject(obj);
        } catch (IOException e) {
            new RuntimeException(e);
        }

    }

    public static<T> T fromFile(Path file) {
        ObjectInputStream obj = null;
        try {
            obj = new ObjectInputStream(Files.newInputStream(file));
            return (T) obj.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e.getMessage(), e);
        } finally {
            if (obj != null) {
                try {
                    obj.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}