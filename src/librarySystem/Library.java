package librarySystem;

import java.util.HashMap;
import java.util.Scanner;

public class Library {
	
	
	private HashMap <Integer, String> bookCollection = new HashMap<>();
	private HashMap <Integer, String> libraryGoers = new HashMap<>();
	
	//code for book collection (handles library inventory)
	
	public void insertBook(int ISBN, String Book)
	{
		bookCollection.put(ISBN, Book);
	}
	
	public int findbook(int ISBN)
	{
		String title = bookCollection.get(ISBN);
		
		if(title!=null)
		{
			System.out.println("Book Title: " + title);
			return 0;
		}
		else {
			System.out.println("Book Not Found");
			
		return -1;
			}
	
	}
/*	public void findBookByISBN(int ISBN)
	{
		String title = bookCollection.get(ISBN);
		
		if(title !=null)
			System.out.println("Book Title: " + title); 
		else 
			System.out.println("Book Not Found");;
	
		
	}*/
	public void removeBook(int ISBN)
	{
		String title = bookCollection.remove(ISBN);
		
		if(title!=null)
			System.out.println(title + " was removed from library ");
		else 
			System.out.println("book not found");
	}
	public void showBooks()
	{
		System.out.println(bookCollection);
	}
	public void bookCheckout(int ISBN)
	{
		
		
		
		int bookavailable = findbook(ISBN);
		
		if(bookavailable ==0)
		{
			
			System.out.println("Book Available for checkout: ");
			
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Do you want to checkout book with ISBN: " +ISBN + "Enter 'Y' for yes & 'N' for no");
			
			String response = keyboard.next();
			
			if(response.equals("Y")|| response.equals("y")) {
				System.out.println("Checking out book ");
				
				removeBook(ISBN);
				
			}
			
			else 
				System.out.println("Book still available");
				
			
		}
		else 
			System.out.println("Book Not Available for checkout");
		
	}
	public void bookReturn()
	{
		
	}
	//code for library goes information(handles patrons library details)
	
	
	public void insertPatron(int libraryID, String patronName)
	{
		libraryGoers.put(libraryID, patronName);
	}
	
	public void findPatron(int libraryID) {
		
		String patronName = libraryGoers.get(libraryID);
		
		if(patronName!=null)
			System.out.println("Card holder: " +patronName);
		else 
			System.out.println("Cant find card holder");
	}
	
	public void removePatron(int libraryID)
	{
		String patronName = libraryGoers.remove(libraryID);
		
		if(patronName!=null)
			System.out.println(patronName + " was removed ");
		else 
			System.out.println("Patron not found");
	}
	public void showPatrons()
	{
		System.out.println(libraryGoers);
	}
	
}
