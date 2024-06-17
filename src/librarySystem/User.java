package librarySystem;

public class User {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private int libraryId;

    public User(String firstName, String lastName,String emailAddress, int libraryId)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.libraryId = libraryId;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }
    public void setLibraryId(int libraryId)
    {
        this.libraryId = libraryId;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String emailAddress()
    {
        return emailAddress;
    }
    public int getLibraryId()
    {
        return libraryId;
    }
    public void getUserDetails()
    {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Library ID#: " + libraryId);
    }
}
