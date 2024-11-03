package librarySystem;

// Import hashmap class to create a hashmap
import java.util.HashMap;

//Library class handles books and users
public class Library {

    //Collection of books and their attributes stored and identified by their ISBN
    private HashMap<Integer, Book> books = new HashMap<>();

    //Collection of users  and their attributes stored and identified by their LibraryId
    private HashMap<Integer, User> users = new HashMap<>();

    //Adds book and its attributes to collection of books
    public void addBook(Book book)
    {
        if (books.containsKey(book.getISBN()))
        {
            System.out.println("Book already in Library, can not add");
        } else
            books.put(book.getISBN(), book);
    }

    //Finds book using the ISBN and then returns the book to the after its found, null if not found
    public Book findBookByISBN(int ISBN)
    {
        if (books.containsKey(ISBN))
        {
            System.out.println("Book found");
            return books.get(ISBN);
        } else {
            System.out.println("Book not found");
            return null;
        }
    }

    //Delete book by ISBN and then returns the book after removed.
    public Book deleteBook(int ISBN)
    {
        if (books.containsKey(ISBN))
        {
            Book bookRemoved = books.get(ISBN);
            books.remove(ISBN);
            System.out.println("Book removed from library");
            return bookRemoved;
        }
        else
        {
            System.out.println("Book not in library");
            return null;
        }
    }

    //Lends book to user by looking for book and availability & using ISBN & then using method lendBook in Book class
    public boolean lendBook(int ISBN)
    {
        if (books.containsKey(ISBN))
        {
            if (books.get(ISBN).getAvailabilitiy()) {
                books.get(ISBN).lendBook();
                System.out.println("Book borrowed");
                return true;
            } else {
                System.out.println("Book Unavailable");
                return false;
            }
        }
        else
        {
            System.out.println("Book not in library");
            return false;
        }
    }

    //Returns book to library using ISBN if unavailable & then using return book method in book class
    public boolean returnBook(int ISBN)
    {
        if (books.containsKey(ISBN))
        {
            if (!books.get(ISBN).getAvailabilitiy())
            {
                books.get(ISBN).returnBook();
                System.out.println("Book Returned");
                return true;
            }
            else
            {
                System.out.println("The book is already in the library");
                return false;
            }
        }
        else
        {
            System.out.println("The book cannot be returned because it is not registered");
            return false;
        }
    }

    //Displays the collection of books
    public void displayAllBooks()
    {
        for (Book book : books.values())
        {
            book.getBookDetails();
        }
    }

    //Adds user and their attributes to collection of users
    public void addUser(User user)
    {

        if (users.containsKey(user.getLibraryId()))
        {
            System.out.println("User already in Library, can not add");
        } else
        {
            users.put(user.getLibraryId(), user);
        }
    }

    //Finds user using their libraryID and then returns the users after found, null if not found
    public User findUser(int libraryID)
    {
        if (users.containsKey(libraryID))
        {
            return users.get(libraryID);
        } else
        {
            return null;
        }
    }

    //Deletes user from collection by using libraryID and the returns the removed users information. null if user not in the collection
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

    //Disables user membership using libraryID if active
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

    //Reactivates User member using libraryID if unactive
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

    //Displays all users information from the collection
    public void displayAllUsers()
    {
        for(User user : users.values())
        {
            user.getUserDetails();
        }
    }
}
