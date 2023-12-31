package SerializacaocomAPInativaJava.aula01Serialization;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Client implements Serializable {

    private static final long serialVersionUID = 7601121546545906508l;

    //all data must be serializable
    private final int id;
    private final String name;

    private final LocalDate birthDate;

    private transient final String document;

    public Client(int id, String name, LocalDate birthDate){
//        this.id = id;
//        this.name = name;
//        this.birthDate = birthDate;//birthDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this( id,  name, birthDate, null);
    }

    public Client(int id, String name, LocalDate birthDate, String document){
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;//birthDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.document = document;
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

    public String getDocument() {
        return document;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && Objects.equals(name, client.name) && Objects.equals(birthDate, client.birthDate) && Objects.equals(document, client.document);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthDate, document);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", document='" + document + '\'' +
                '}';
    }
}
