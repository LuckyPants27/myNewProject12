import java.util.Objects;

public class Book {
    String bookname;
    Author author;
    int publicationYear;

    //<editor-fold desc="Getters-Setters">
    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    //</editor-fold>

    public Book(String bookname, Author author, int publicationYear) {
        this.bookname = bookname;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(bookname, book.bookname) && Objects.equals(author, book.author);
    }

    public int hashCode() {
        return Objects.hash(bookname, author, publicationYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                ", author=" + author +
                ", publicationYear=" + publicationYear +
                '}';
    }
}