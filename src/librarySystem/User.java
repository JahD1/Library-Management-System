package librarySystem;

public class User {
	
	private String name;
	private String email;
	private int libraryCardNum;
	
	User()
	{
		this.name = "no name yet";
		this.email = "no email yet";
		this.libraryCardNum = 0;
	}
	User(String userName, String userEmail, int cardNumber)
	{
		this.name = userName;
		this.email = userEmail;
		this.libraryCardNum = cardNumber;
	}
	
	public void setName(String userName)
	{
		this.name = userName;
	}
	public String getName()
	{
		return name;
	}
	public void setEmail(String userEmail)
	{
		this.email = userEmail;
	}
	public String getEmail()
	{
		return email;
	}
	public void setLibraryCardNum(int cardNumber)
	{
		this.libraryCardNum = cardNumber;
	}
	public int getLibraryCardNum()
	{
		return libraryCardNum;
	}
	
	public void printUserInfo()
	{
		System.out.println("User Name: "+ getName());
		System.out.println("Library Card Number: "+getLibraryCardNum());
		System.out.println("Email: "+getEmail());
	}
}
