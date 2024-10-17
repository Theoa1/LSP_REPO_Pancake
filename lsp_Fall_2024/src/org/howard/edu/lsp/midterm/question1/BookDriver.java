/**
 * Driver class to test the Book class.
 */
public class BookDriver {
    public static void main(String[] args) {
        // Creating book instances
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);

        // Checking if books are equal
        System.out.println(book1.equals(book2)); // true
        System.out.println(book1.equals(book3)); // false

        // Printing book details
        System.out.println(book1); // Output: Title: The Great Gatsby, Author: F. Scott Fitzgerald, ISBN: 123456789, Year Published: 1925
    }
}
