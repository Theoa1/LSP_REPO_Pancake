/**
 * Represents a book in the library.
 * Contains information about the title, author, ISBN, and year published.
 */
public class Book {
    // Private fields to ensure encapsulation
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    /**
     * Constructor to initialize a new Book object with the given attributes.
     *
     * @param title         The title of the book.
     * @param author        The author of the book.
     * @param ISBN          The unique ISBN of the book.
     * @param yearPublished The year the book was published.
     */
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    // Getters and Setters with proper encapsulation

    /**
     * Gets the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     *
     * @param title The new title of the book.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the author of the book.
     *
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book.
     *
     * @param author The new author of the book.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets the ISBN of the book.
     *
     * @return The ISBN of the book.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Sets the ISBN of the book.
     *
     * @param ISBN The new ISBN of the book.
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Gets the year the book was published.
     *
     * @return The year the book was published.
     */
    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * Sets the year the book was published.
     *
     * @param yearPublished The new year of publication.
     */
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    /**
     * Checks if two Book objects are equal based on the ISBN and author.
     *
     * @param obj The object to be compared with this Book.
     * @return true if the ISBN and author are the same, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        // If the same object, return true
        if (this == obj) {
            return true;
        }
        // If obj is null or not the same class, return false
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // Cast obj to Book and compare ISBN and author
        Book book = (Book) obj;
        return ISBN.equals(book.ISBN) && author.equals(book.author);
    }

    /**
     * Provides a string representation of the Book object.
     *
     * @return A string in the format: "Title: ..., Author: ..., ISBN: ..., Year Published: ..."
     */
    @Override
    public String toString() {
        return "Title: " + title +
               ", Author: " + author +
               ", ISBN: " + ISBN +
               ", Year Published: " + yearPublished;
    }
}
