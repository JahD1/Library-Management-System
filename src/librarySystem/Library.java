package librarySystem;

import java.util.HashMap;

public class Library {

    private HashMap<Integer, Book> books = new HashMap<>();
    private HashMap <Integer, User> users = new HashMap<>();

    public void addBook(Book book) {
        if (books.containsKey(book.getISBN())) {
            System.out.println("Book already in Library, can not add");
        } else
            books.put(book.getISBN(), book);
    }
    public Book findBook(Book book)
    {
        if(books.containsKey(book.getISBN()))
        {
            return books.get(book.getISBN());
        }else
            return null;
    }
    public Book deleteBook(Book book)
    {
        books.remove(book.getISBN());
        System.out.println("Book removed from library");
        return book;
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
            deleteBook(book);
        }else
            System.out.println("Book not available for checkout");
    }


}
