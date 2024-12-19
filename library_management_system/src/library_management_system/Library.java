package library_management_system;
import java.util.*;
public class Library {
	ArrayList<Book>books=new ArrayList<>();
	Scanner in=new Scanner(System.in);
	
	void addBook()
	{
		System.out.println("Enter the Book ID: ");
		int id=in.nextInt();
		in.nextLine();
		System.out.println("Enter the Book Title");
		String title=in.next();
		books.add(new Book(id,title));
		System.out.print("Books added successfully\n");
	}
	
	void removeBook()
	{
		System.out.println("Enter the Book ID to remove");
		int id=in.nextInt();
		books.removeIf(Book->Book.id==id);
		System.out.print("Book removed Successfully\n");
	}
	
	void issuebook()
	{
		System.out.print("Enter the book ID to be issued");
		int id=in.nextInt();
		for(Book b:books)
		
		{
			if(b.id==id && !b.issued)
			{
				b.issued=true;
				System.out.print("Book issued successfully");
				return;
			}
			else if(b.id==id)
			{
				System.out.print("Book is already issued\n");
				return;
			}
			else
			{
				System.out.print("Book is not found\n");	
			}
	     	}
        	}
	void returnBook() {
		System.out.println("Enter the book Id to return: ");
		int id = in.nextInt();
		for(Book b : books) {
			if(b.id == id && b.issued)
			{
				b.issued=false;
				System.out.println("Book returned successfully..\n");
				return;
			}
			else
			{
				System.out.println("Book not found or issued");
				return;
			}
			
		}
	}
    	  
      void displayBooks()
      {
  		System.out.println("Available Books :");
  		for(Book b : books) 
  		{
  			System.out.println("ID : "+b.id+" , Title: "+b.title+" , Issued: "+(b.issued?"yes":"No"));
  			
  		}
  		
  		System.out.println();
  	}		
    	
    	}
    	
      
	
	


