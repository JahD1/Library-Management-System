package librarySystem;

public class LibraryApp {

    public static void main(String[] args) {

        Book newbook = new Book("Harry Potter ", "Nadjah " ,"Horror ", 12345);

        Library library = new Library();
        library.addBook(newbook);

        library.lendBook(12345);

        library.displayAllBooks();


        //library.bookCheckout(newbook);
    }
}