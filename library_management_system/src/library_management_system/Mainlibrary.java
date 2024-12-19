package library_management_system;
import java.util.*;
public class Mainlibrary {

	public static void main(String[] args) {
		  Library library = new Library();
	        Scanner in = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("=== Library Management System ===");
	            System.out.println("1. Add Book");
	            System.out.println("2. Remove Book");
	            System.out.println("3. Issue Book");
	            System.out.println("4. Return Book");
	            System.out.println("5. Display Available Books");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            choice = in.nextInt();

	            switch (choice) {
	                case 1:
	                    library.addBook();
	                    break;
	                case 2:
	                    library.removeBook();
	                    break;
	                case 3:
	                    library.issuebook();
	                    break;
	                case 4:
	                    library.returnBook();
	                    break;
	                case 5:
	                    library.displayBooks();
	                    break;
	                case 6:
	                    System.out.println("Exiting... Thank you!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Try again.\n");
	            }
	            }
	        
	        while (choice != 6);
	        in.close();
    
	          	}

                }
