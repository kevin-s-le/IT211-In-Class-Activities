import java.util.ArrayList;
public class Book {
    // Attribute of Book class
    private String title;
    private String author;
    private String ISBN;

// Constructor to initialize Book class
    public Book(String title, String author, String ISBN) {
        this.title = title; // Set the title attribute
        this.author = author; // Set the author attribute
        this.ISBN = ISBN; // Set the ISBN attribute
    }

    // Getter method for the title attribute
    public String getTitle() {
        return title;
    }

    // Getter method for the author attribute
    public String getAuthor() {
        return author;
    }

    // Getter method for the ISBN attribute
    public String getISBN() {
        return ISBN;
    }

    // Method to return a string representation of the Book object
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }

    // Class to manage a collection of books
    public static class BookCollection {
        private ArrayList<Book> books;

        // Constructor to initialize the BookCollection object
        public BookCollection() {
            books = new ArrayList<>(); // Initialized the ArrayList to store books
        }

        // Method to be able to add a book to the collection
        public void addBook(Book book) {
            books.add(book);
            System.out.println("Book added: " + book);
        }

        // Method to be able to remove a book from the collection by ISBN
        public void removeBookByISBN(String ISBN) {
            for (Book book: books) {
                if (book.getISBN().equals(ISBN)) {
                    books.remove(book);
                    System.out.println("Book removed: " + book);
                    return;
                }
            }
            System.out.println("Book with ISBN " + ISBN + " not found.");
        }
        // Method to display books in the collection
        public void displayBooks() {
            System.out.println("Book Collection: ");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
    public static void main(String[] args) {
        // Create an instance of the BookCollection class
        BookCollection collection = new BookCollection();
        // Create and add books to the collection
        Book book1 = new Book("1984", "George Orwell", "12345678");
        Book book2 = new Book("Jurassic Park", "Michael Crichton", "51234122");
        Book book3 = new Book("The Lord of the Rings", "J. R. R. Tolkien", "33125123");
        collection.addBook(book1);
        collection.addBook(book2);
        collection.addBook(book3);

        // Display all books in the collection
        collection.displayBooks();
       
        // Remove the book by ISBN
        collection.removeBookByISBN("12345678");

        // Display all the books in the collection after removal
        collection.displayBooks();
    }
}