package librarySystem;

public class User {

    //Attributes of user information used in a library
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String borough;
    private int libraryId;

    //Allows you to see if a person is a member
    private boolean isAMember;

    //Constructor creates new user with personal info and they are set to not a member
    public User(String firstName, String lastName,String emailAddress, String borough)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.borough = borough;
        this.libraryId = 0;

        //Membership status of user
        isAMember = false;

    }

    //Allows users that exist first name to be changed
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    //Allows user that exist last name to be changed
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    //Allows user that exist email address to be changed
    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    //Removes membership status from a user
    public void removeMember()
    {
        isAMember = false;
    }

    //Adds membership status to a user
    public void addMember()
    {
        isAMember = true;
    }

    //Checks if user is a member. if so sets library id # if not. prompts user to become a member
    public void setLibraryId(int libraryId)
    {
        if(isAMember)
        {
            this.libraryId = libraryId;
        }
        else
        {
            System.out.println("Become a member and try again. You are not a member of the library");
        }
    }

    //Allows borough of a user that exist to be changed
    public void setBorough (String borough)
    {
        this.borough = borough;
    }

    //Returns the first name of user
    public String getFirstName()
    {
        return firstName;
    }

    //Returns the last name of user
    public String getLastName()
    {
        return lastName;
    }

    //Returns the email address if user
    public String getEmailAddress()
    {
        return emailAddress;
    }

    //Returns library id of user
    public int getLibraryId()
    {
        return libraryId;
    }

    //Returns the borugh of where the user is from
    public String getBorough()
    {
        return borough;
    }

    //Returns the member status of a user
    public boolean isAMember()
    {
        return isAMember;
    }

    //Displays user information
    public void getUserDetails()
    {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Library ID#: " + libraryId);
        System.out.println("Borough: " + borough);
    }
}
