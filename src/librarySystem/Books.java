package librarySystem;

public class Books {
	
	private String title ;
	private int ISBN;
	private String author;
	
	
	
	Books(){
		
		this.title = "no title yet";
		this.author = "no author yet";
		this.ISBN = 0;
	}
	
	Books(String name, String authorName, int bookID, Library insertbook)
	{
		this.title = name;
		this.author= authorName;
		this.ISBN = bookID;
		insertbook.insertBook(bookID, name);
	}
	
	
	public void setTitle(String name)
	{
		this.title = name;
	}
	public String getTitle()
	{
		return title;
	}
	
	public void setISBN(int bookID)
	{
		this.ISBN = bookID;
	}
	public int getISBN()
	{
		return ISBN;
	}
	public void setAuthor(String authorName)
	{
		this.author = authorName;
	}
	public String getAuthor()
	{
		return author;
	}	
	public void printBookInfo()
	{
		System.out.println("Book Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Book ISBN: "+ISBN);
		
	}

}
