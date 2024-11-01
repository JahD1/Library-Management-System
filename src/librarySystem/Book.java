package librarySystem;

//Book class that defines each unique book
public class Book {

    //Attributes of the book in a library
    private int ISBN;
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;

    //Constructor creates a new book with given attributes
    public Book(String title, String author, String genre, int ISBN) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.genre = genre;

        //Book is automatically available once placed in the library
        this. isAvailable = true;
    }

    //Allows the title of book that already exist to be changed
    public void setTitle(String title) {
        this.title = title;
    }

    //Allows the author of book that already exist to be changed
    public void setAuthor(String author)
    {
        this.author = author;
    }

    //Allows ISBN of book that already exist to be changed
    public void setISBN(int isbn)
    {
        this.ISBN = isbn;
    }

    //Allow genre of book that already exist to be changed
    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    //Book becomes unavailable when it is taken out
    public void lendBook()
    {
        this.isAvailable = false;
    }

    //Book becomes available when returned
    public void returnBook ()
    {
        this.isAvailable = true;
    }

    //Returns the current availability of a book
    public boolean getAvailabilitiy() {
        return isAvailable;
    }

    //Returns the ISBN of a book
    public int getISBN()
    {
        return ISBN;
    }

    //Returns the title of a book
    public String getTitle()
    {
        return title;
    }

    //Gets the author of a book
    public String getAuthor()
    {
        return author;
    }
    public String getGenre()
    {
        return genre;
    }


    //Displays the details of the book
    public void getBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Availability: " + isAvailable);
    }
}
