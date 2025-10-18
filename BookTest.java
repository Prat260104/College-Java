record Book(String title, double price, String author) {}

public class BookTest {
    public static void main(String[] args) {
        Book[] books = {
            new Book("Java Basics", 450, "James Gosling"),
            new Book("Spring Boot Mastery", 650, "Craig Walls"),
            new Book("Data Structures", 800, "Mark Allen Weiss")
        };

        System.out.println("Books priced above 500:");
        for (Book b : books) {
            if (b.price() > 500) {
                System.out.println(b);
            }
        }
    }
}
