
public class Entry {

    private String name; 
    private long age; 
    private long phoneNumber; 
    private String emailAddress;  
    
    // Creates Contact object based on parameters.
    public Entry(String name, long age, long phoneNumber, String emailAddress) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
    }

    // Changes phone number of Entry
    public void setPhoneNumber(int newNumber) {
		phoneNumber = newNumber;
    }
    
    // Changes email address of an Entry
    public void setEmailAddress(String newEmail) {
		emailAddress = newEmail;
    }
    
    // Changes name of an Entry
    public void setName(String newName) {
		name = newName;
    }
    
    // Changes age of an Entry
    public void setAge(long newAge) {
		phoneNumber = newAge;
    }
    
    // Returns the name of an Entry
    public String getName() {
		return name;
    }

    // Returns the age of a Entry
    public long getAge() {
		return age;
    }

    // Returns the phone number of a Entry
    public long getPhoneNumber() {
		return phoneNumber;
    }
    
    // Returns email
    public String getEmailAddress() {
		return emailAddress;
    }
    
    // Prints all information about a Entry out.
    @Override
    public String toString() {
        return  "Name: " + name + " Age: " + age + " Phone#: " + phoneNumber +
                " Email: " + emailAddress;
    }
    
    public String toString(int number) {
    	return "" + number;
    }

}
