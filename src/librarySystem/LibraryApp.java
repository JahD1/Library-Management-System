package librarySystem;

public class LibraryApp {

    public static void main(String[] args) {

        Book newbook = new Book("Harry Potter ", "Nadjah " ,"Horror ", 12345);

        newbook.lendBook();

        Library library = new Library();
        library.addBook(newbook);



        library.displayAllBooks();

        newbook. returnBook();

        library.displayAllBooks();
        //library.bookCheckout(newbook);
    }
}