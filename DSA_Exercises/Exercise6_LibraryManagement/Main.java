package Exercise6_LibraryManagement;

public class Main {

    public static void main(String[] args) {

        // Books sorted by title
        Book[] books = {

            new Book(101, "C Programming", "Dennis Ritchie"),
            new Book(102, "Data Structures", "Mark Allen Weiss"),
            new Book(103, "Java Programming", "Herbert Schildt"),
            new Book(104, "Operating Systems", "Abraham Silberschatz"),
            new Book(105, "Python Programming", "Guido van Rossum")

        };

        System.out.println("===== Linear Search =====");

        Book result1 = LinearSearch.search(books, "Java Programming");

        if (result1 != null) {
            System.out.println(result1);
        } else {
            System.out.println("Book Not Found");
        }

        System.out.println("\n===== Binary Search =====");

        Book result2 = BinarySearch.search(books, "Java Programming");

        if (result2 != null) {
            System.out.println(result2);
        } else {
            System.out.println("Book Not Found");
        }
    }
}
