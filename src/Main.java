public class Main {
    public static void main(String[] args) {

        Author fh = new Author("Frank", "Herbert");
        Book dune = new Book("Dune", fh, 1963);

        Author kv = new Author("Kurt", "Vonnegut");
        Book sf = new Book("Slaughterhouse-Five", kv, 1969);

        sf.setPublicationYear(2024);

        System.out.println(sf);
    }
}