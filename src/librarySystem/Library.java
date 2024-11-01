package librarySystem;

// Import hashmap class to create a hashmap
import java.util.HashMap;

//Library class handles books and users
public class Library {

    //
    private HashMap <Integer, Book> books = new HashMap<>();
    private HashMap <Integer, User> users = new HashMap<>();

    public void addBook(Book book) {
        if (books.containsKey(book.getISBN())) {
            System.out.println("Book already in Library, can not add");
        } else
            books.put(book.getISBN(), book);
    }

    public Book findBookByISBN(int ISBN)
    {
        if(books.containsKey(ISBN))
        {
            return books.get(ISBN);
        }
        else
            return null;
    }

    public Book deleteBook(int ISBN)
    {
        if(books.containsKey(ISBN))
        {
            Book bookRemoved = books.get(ISBN);
            books.remove(ISBN);
            System.out.print("Book removed from library");
            return bookRemoved;
        }
        else
        {
            System.out.println("Book not in library");
            return null;
        }
    }
    
    public boolean lendBook (int ISBN)
    {
        if(books.containsKey(ISBN))
        {
            if(books.get(ISBN).getAvailabilitiy())
            {
                books.get(ISBN).lendBook();
                return true;
            }
            else
            {
                System.out.print("Book Unavailable");
                return false;
            }
        }
        else
        {
            System.out.println("Book not in library");
            return false;
        }

    }
    public void displayAllBooks()
    {
        for(Book book : books.values())
        {
            book.getBookDetails();
        }
    }
    public void addUser(User user)
    {
        if(users.containsKey(user.getLibraryId()))
        {
            System.out.println("User already in Library, can not add");
        }else
            users.put(user.getLibraryId(), user);
    }
    public User findUser(User user)
    {
        if(users.containsKey(user.getLibraryId()))
        {
            return users.get(user.getLibraryId());
        }else
            return null;
    }
    public User deleteUser(User user)
    {
        users.remove(user.getLibraryId());
        System.out.println("User Deleted");
        return user;
    }
    public void displayAllUsers()
    {
        for(User user : users.values())
        {
            user.getUserDetails();
        }
    }
    public void bookCheckout(Book book)
    {
        if(books.containsKey(book.getISBN()))
        {
            books.get(book.getISBN()).getBookDetails();
            System.out.println("Book Checked Out");
           // deleteBook(books);
        }else
            System.out.println("Book not available for checkout");
    }


}
