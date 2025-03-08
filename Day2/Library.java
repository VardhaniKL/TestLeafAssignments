package week1.day2;


public class Library {
	
	char addBook(String bookTitle)
	{
		System.out.println("Book Added successfully: " + bookTitle);
		return 'b';
	}

	void issueBook()
	{
		System.out.println("Book Issued successfully");

	}
	

	public static void main(String[] args) {
		
		Library o=new Library();
		
		
		System.out.println("printing from main " + o.addBook("Harry Potter"));
		o.issueBook();
		

	}

}
