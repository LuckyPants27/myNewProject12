import java.util.Objects;

public class Author {
    String name;
    String secondName;

    //<editor-fold desc="Getters-Setters">
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    //</editor-fold>

    public Author(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(secondName, author.secondName);
    }

    public int hashCode() {
        return Objects.hash(name, secondName);
    }
}