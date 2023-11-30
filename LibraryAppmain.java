package miniproject;

import java.util.Scanner;

public class LibraryAppmain {

	public static void main(String[] args) {
		{
		    System.out.println("======================================================================");
		    System.out.println("================= ! WELCOME TO THE LIBRARY ! =========================");
		    System.out.println("======================================================================");
		   
		     Scanner scanner = new Scanner(System.in);
	         LibraryApp library = new LibraryApp();

	        while (true) {
	            System.out.println("1. Add Book");
	            System.out.println("2. Display Books");
	            System.out.println("3. Cancel Book");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    scanner.nextLine(); 
	                    System.out.print("Enter book title: ");
	                    String title = scanner.nextLine();
	                    System.out.print("Enter author name: ");
	                    String author = scanner.nextLine();

	                    Book newBook = new Book(title, author);
	                    library.addBook(newBook);
	                    System.out.println("Book added successfully!");
	                    System.out.println("======================================================================");
	         		   
	                    break;

	                case 2:
	                    library.displayBooks();
	                    break;

	                case 3:
	                    scanner.nextLine(); 
	                    System.out.print("Enter the title of the book to cancel: ");
	                    String cancelTitle = scanner.nextLine();
	                    boolean canceled = library.cancelBook(cancelTitle);
	                    if (canceled) {
	                        System.out.println("Book canceled successfully!");
	                        System.out.println("======================================================================");
	 	         		   
	                    } else {
	                        System.out.println("Book not found in the library.");
	                    }
	                    break;

	                case 4:
	                    System.out.println("Exiting the Library System. Thank you for make use of library!");
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	                    
	            }
	            

	        }
	        
	}
}
}