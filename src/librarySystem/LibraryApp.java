package librarySystem;

public class LibraryApp {

    public static void main(String[] args) {

        Book newbook = new Book(12345, "Harry Potter", "J.K. Rowling", "Fantasy");
        Library library = new Library();
        library.addBook(newbook);
        newbook.getBookDetails();
    }
}
