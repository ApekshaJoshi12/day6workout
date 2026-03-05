import java.util.LinkedHashSet;

public class BookTitles {
    public static void main(String[] args) {

        LinkedHashSet<String> books = new LinkedHashSet<>();

        books.add("Java Programming");
        books.add("Data Structures");
        books.add("Operating Systems");
        books.add("Java Programming");  
        books.add("Database Systems");

        System.out.println("Book Titles:");
        for (String book : books) {
            System.out.println(book);
        }
    }
}