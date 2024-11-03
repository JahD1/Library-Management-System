package librarySystem;

public class LibraryApp {

    public static void main(String[] args) {

        Book newbook = new Book("Harry Potter ", "Nadjah " ,"Horror ", 12345);

        Library library = new Library();
        library.addBook(newbook);

        library.lendBook(12345);

        library.displayAllBooks();

        library.returnBook(12345);

        library.displayAllBooks();

        library.deleteBook(12345);

        System.out.println("After book removed: ");
        library.displayAllBooks();

        Book newbook2 = new Book("Nadjah ", "Nadjah ", "Beauty", 12346);

        library.addBook(newbook2);

        library.displayAllBooks();

        library.addBook(newbook);

        library.displayAllBooks();

        library.findBookByISBN(12345);




    }
}