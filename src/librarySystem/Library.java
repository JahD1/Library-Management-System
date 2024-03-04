package librarySystem;

import java.util.HashMap;

public class Library {
	
	
	private HashMap <Integer, String> bookCollection = new HashMap<>();
	private HashMap <Integer, String> libraryGoers = new HashMap<>();
	
	//code for book collection (handles library inventory)
	
	public void insertBook(int ISBN, String Book)
	{
		bookCollection.put(ISBN, Book);
	}
	public void findBookByISBN(int ISBN)
	{
		String title = bookCollection.get(ISBN);
		
		if(title !=null)
			System.out.println("Book Title: " + title); 
		else 
			System.out.println("Book Not Found");;
	
		
	}
	public void removeBook(int ISBN)
	{
		String title = bookCollection.remove(ISBN);
		
		if(title!=null)
			System.out.println(title + " was removed ");
		else 
			System.out.println("book not found");
	}
	public void showBooks()
	{
		System.out.println(bookCollection);
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
