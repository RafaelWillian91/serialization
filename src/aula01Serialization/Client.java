package aula01Serialization;

import java.io.Serializable;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Client implements Serializable {

    //all data must be serializable
    private final int id;
    private final String name;

    private final LocalDate birthDate;

    public Client(int id, String name, LocalDate birthDate){
        this.id = id;
        this.name = name;
        System.out.println(birthDate);
        String s = birthDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(s);
        LocalDate l1 = LocalDate.parse(s, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Local=> "+l1);
        this.birthDate = l1;//birthDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && Objects.equals(name, client.name) && Objects.equals(birthDate, client.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthDate);
    }

    @Override
    public String toString() {
        return "aula01Serialization.Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
