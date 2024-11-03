package librarySystem;

// Import hashmap class to create a hashmap
import java.util.HashMap;

//Library class handles books and users
public class Library {

    //
    private HashMap<Integer, Book> books = new HashMap<>();
    private HashMap<Integer, User> users = new HashMap<>();

    public void addBook(Book book) {
        if (books.containsKey(book.getISBN())) {
            System.out.println("Book already in Library, can not add");
        } else
            books.put(book.getISBN(), book);
    }

    public Book findBookByISBN(int ISBN) {
        if (books.containsKey(ISBN)) {
            System.out.println("Book found");
            return books.get(ISBN);
        } else {
            System.out.println("Book not found");
            return null;
        }
    }

    public Book deleteBook(int ISBN) {
        if (books.containsKey(ISBN)) {
            Book bookRemoved = books.get(ISBN);
            books.remove(ISBN);
            System.out.println("Book removed from library");
            return bookRemoved;
        } else {
            System.out.println("Book not in library");
            return null;
        }
    }

    public boolean lendBook(int ISBN) {
        if (books.containsKey(ISBN)) {
            if (books.get(ISBN).getAvailabilitiy()) {
                books.get(ISBN).lendBook();
                System.out.print("Book borrowed");
                return true;
            } else {
                System.out.print("Book Unavailable");
                return false;
            }
        } else {
            System.out.println("Book not in library");
            return false;
        }
    }

    public boolean returnBook(int ISBN) {
        if (books.containsKey(ISBN)) {
            if (!books.get(ISBN).getAvailabilitiy()) {
                books.get(ISBN).returnBook();
                System.out.println("Book Returned");
                return true;
            } else {
                System.out.println("The book is already in the library");
                return false;
            }
        } else {
            System.out.println("The book cannot be returned because it is not registered");
            return false;
        }
    }

    public void displayAllBooks() {
        for (Book book : books.values()) {
            book.getBookDetails();
        }
    }

    public void addUser(User user) {
        if (users.containsKey(user.getLibraryId())) {
            System.out.println("User already in Library, can not add");
        } else {
            users.put(user.getLibraryId(), user);
        }
    }

    public User findUser(int libraryID) {

        if (users.containsKey(libraryID)) {
            return users.get(libraryID);
        } else {
            return null;
        }
    }

    public User deleteUser(int libraryID)
    {
        if (users.containsKey(libraryID)) {
            User toBeDeleted = users.get(libraryID);
            users.remove(libraryID);
            System.out.println("User removed from library");
            return toBeDeleted;
        } else {
            System.out.println("User cannot be removed because they are not registered");
            return null;
        }
    }

    public boolean removeMemberStatus(int libraryID)
    {
        if (users.containsKey(libraryID))
        {
            if(users.get(libraryID).isAMember())
            {
                users.get(libraryID).removeMember();
                System.out.println("Member status removed: ");
                return true;
            }
            else
            {
                System.out.print("Member status is not active ");
                return false;
            }
        }
        else
        {
            System.out.println("User ID does not exist");
            return false;
        }
    }

    public boolean activateMemberStatus(int libraryID)
    {
        if(users.containsKey(libraryID))
        {
            if(!users.get(libraryID).isAMember())
            {
                users.get(libraryID).addMember();
                System.out.println("User member status activated");
                return true;
            }
            else
            {
                System.out.println("User member status already active ");
                return false;
            }
        }
        else
        {
            System.out.println("User ID does not exist ");
            return false;
        }
    }

    public void displayAllUsers()
    {
        for(User user : users.values())
        {
            user.getUserDetails();
        }
    }


}
