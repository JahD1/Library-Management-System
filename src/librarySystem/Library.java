package librarySystem;

import java.util.HashMap;

public class Library {

    private HashMap<Integer, Book> books = new HashMap<>();
    private HashMap <Integer, User> users = new HashMap<>();

    public void addBook(Book book)
    {
        if(books.containsKey(book.getISBN()))
        {
            System.out.println("Book already in Library, can not add");
        }else
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
        findBook(book);
        books.remove(book.getISBN());
        return book;
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
        findUser(user);
        users.remove(user.getLibraryId());
        return user;
    }


}
