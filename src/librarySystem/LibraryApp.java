package librarySystem;

public class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Books b1 = new Books();
		
		b1.printBookInfo();
		
		System.out.println(b1.getAuthor());
		System.out.println(b1.getISBN());
		System.out.println(b1.getTitle());
		
		
		User user1 = new User();
		
		System.out.println(user1.getEmail());
		System.out.println(user1.getLibraryCardNum());
		System.out.println(user1.getName());
		
		user1.printUserInfo();

	}

}
