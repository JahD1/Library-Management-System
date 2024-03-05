package librarySystem;

public class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library l1 = new Library ();
		Books b1 = new Books("Nadjah Duke", "Loves coding", 1234, l1);
		Books b2 = new Books("Nadjah ", "Loves coding", 1254, l1);
		
		/*b1.printBookInfo();
		
		System.out.println(b1.getAuthor());
		System.out.println(b1.getISBN());
		System.out.println(b1.getTitle());
		
		
		User user1 = new User();
		
		System.out.println(user1.getEmail());
		System.out.println(user1.getLibraryCardNum());
		System.out.println(user1.getName());
		
		user1.printUserInfo();*/
		
		
		
		l1.showBooks();
		
		
		l1.findbook(123);
		l1.bookCheckout(1234);
		/*l1.removeBook(1234);
		
		l1.removeBook(1254);
		
		
		User u1 = new User( "nadjah ", "nadjah@gmail.com",1234, l1);
		
		l1.showPatrons();
		*/
		
		
		
		
		

	}

}
