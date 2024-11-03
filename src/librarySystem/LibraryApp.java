//Testing Library class, Book Class and User class

package librarySystem;

//Library application class
public class LibraryApp {

    //Main Method
    public static void main(String[] args) {

       /* Book newbook = new Book("Harry Potter ", "Nadjah " ,"Horror ", 12345);

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


        */


        User user = new User("Nadjah", "Nadjah", "Nadjah",  12345);
        Library library = new Library();
/*
        library.displayAllUsers();

        library.addUser(user);
        library.displayAllUsers();

        library.activateMemberStatus(12345);
        library.displayAllUsers();

        library.removeMemberStatus(12345);
        library.displayAllUsers();

        library.deleteUser(12345);
        library.displayAllUsers();

*/
        user.addMember();

        library.addUser(user);

        library.displayAllUsers();

        user.setLibraryId(123);

        library.displayAllUsers();


    }
}