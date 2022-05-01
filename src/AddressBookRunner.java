import java.util.Scanner;

public class AddressBookRunner {
	
    public static void menu() {
		System.out.println("1.Add a new entry to your address book.");
		System.out.println("2.Delete an entry from your address book.");
		System.out.println("3.Search for an entry.");
		System.out.println("4.Print out information of all of your entries.");
		System.out.println("5.Quit.");
		System.out.println("6.Delete address book. If you delete your address book you can always "
				+ "\n" + "add a new entry to create another address book.");
		System.out.println("Enter your menu choice:");
    }
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		// Instantiate AddressBook object
		AddressBook contactbook = new AddressBook();

 		// Menu driven loop.
		menu();
		int choice = stdin.nextInt();
		while (choice!=5) {

	    	// Only adds contact if there is room in AddressBook contactbook.
	    	if (choice == 1) {


		    		//Reads in all appropriate information.");
		    		System.out.println("Enter their name:");
		    		String name = stdin.next() + stdin.nextLine();
		    		System.out.println("Enter their age.");
		    		int age = stdin.nextInt();
		    		System.out.println("Enter their phone number.");
		    		long number = stdin.nextLong();
		    		System.out.println("Enter their email address.");
		    		String emailAddress = stdin.next() + stdin.nextLine();

		    		// Uses information to create Contact object, which is
		    		// a parameter to the addContact method.
		    		contactbook.addAnEntry(new Entry(name,age,number,emailAddress));
	    	}	
	    	// Implements rest of the choices by calling appropriate AddressBook methods on contactbook.
	    	else if (choice == 2) {
				System.out.println("What is the email address of the entry you want to delete?");
				String email = stdin.next() +stdin.nextLine();
				contactbook.removeAnEntry(email);
	    	}
	    	else if (choice == 3) {
	    		System.out.println("Do you want to search using a name, email address, phone number, or age?");
	    		String enter = stdin.next() + stdin.nextLine();
	    		if(enter.equals("email address") || enter.equals("name")) {
					System.out.println("What is the email address or name of the entry you want to search for?");
		    		String entry = stdin.next() + stdin.nextLine();
		    		contactbook.searchForAnEntry(entry);
	    		}else {
	    			System.out.println("What is the age or phone number of the entry you want to search for?");
	    			long entry = stdin.nextLong();
		    		contactbook.searchForAnEntry(entry);
	    		}
	    	}
	    	else if (choice == 4)
				contactbook.printAddressBook();
	    	else if (choice == 6)
	    		contactbook.deleteAddressBook();
	    	else if (choice !=5)
				System.out.println("Sorry, that was an invalid menu choice, try again.");

	    	menu();
	    	choice = stdin.nextInt();
		}
	}
}	

		
