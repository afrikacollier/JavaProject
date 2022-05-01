import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	
	//variables
	private String emailAddress; 
	private String printAddressBook;
	private static List<Entry> entryList = new ArrayList<Entry>();
	private static Entry entry;
	
	//constructor (checkmark)
	public AddressBook() {
		this(entryList, entry);
	}
	
	//constructor (checkmark)
	public AddressBook(List<Entry> entryList, Entry entry){
		entryList = null;
		this.entryList = entryList;
		entry = null;
		this.entry = entry;
	}
	
	//Add an Entry (checkmark)
	public List<Entry> addAnEntry(Entry entry){
		if(entryList != null) {
			entryList.add(entry);
			return entryList;
		}else {
			System.out.println("You created a new Address Book! ");
			entryList = new ArrayList<Entry>();
			entryList.add(entry);
			return entryList;
		}
	}
    
    //Remove an Entry (checkmark)
	public void removeAnEntry(String entryToRemove) {
		if(entryList.size() > 0 && entryList.toString().contains(entryToRemove)) {
			outer: 
			for(int i=0; i<entryList.size(); i++){
					if(entryList.get(i).getEmailAddress().toString().equals(entryToRemove)){
						entry = entryList.remove(i);
						System.out.println("You have successfully removed the entry " +entry);
						continue outer;
					}
			}
		}else {
			System.out.println("This entry is not in your Address Book.");
		}
	}
    
    //Search for a Specific Entry (checkmark)
	public void searchForAnEntry(String entryToSearchFor) {
		if(entryList.size() > 0 && entryList.toString().contains(entryToSearchFor)) {
			outer: 
			for(int i=0; i<entryList.size(); i++){
					if(entryList.get(i).getEmailAddress().toString().equals(entryToSearchFor) || entryList.get(i).getName().toString().equals(entryToSearchFor)){
						System.out.println("You have successfully found " +entryList.get(i).toString() + " in the Address Book");
						continue outer;
					}
			}
		}else {
			if(this.entry != null) {
				System.out.println("This entry is not in your Address Book");
			}
		}
	}
	
	// Search for an entry
	public void searchForAnEntry(long entryToSearchFor) {
		String newEntryToSearchFor = Long.toString(entryToSearchFor);
		if(entryList.size() > 0 && entryList.toString().contains(newEntryToSearchFor)) {
			outer: 
			for(int i=0; i<entryList.size(); i++){
					if((entryList.get(i).getAge() == entryToSearchFor) || (entryList.get(i).getPhoneNumber() == entryToSearchFor)){
						System.out.println("You have successfully found " +entryList.get(i).toString() + " in the Address Book");
						continue outer;
					}
			}
		}else {
			if(this.entry != null) {
				System.out.println("This entry is not in our Address Book.");
			}
		}
	}
    
    //Print Address Book (checkmark)
	public void printAddressBook() {
		String totalEntries ="";
		if(entryList != null) {
			if(entryList.size() > 0) {
				for(int i = 0; i<entryList.size(); i++) {
					Entry e = entryList.get(i);
					totalEntries = totalEntries +"\n"+ e.toString(); 
					printAddressBook = totalEntries;
				}
				System.out.println(printAddressBook);
			}
		}else {
			System.out.println("There is nothing in the Address Book.");
		}
	}
    
    //Delete Book (checkmark)
	public void deleteAddressBook() {
		entryList = null;
		System.out.println("You have successfully deleted your Address Book.");
	}
    
    //Quit (checkmark)
	public void quit() {
		System.out.println("Thanks for using the application.");
		System.exit(1);
	}
	
}
