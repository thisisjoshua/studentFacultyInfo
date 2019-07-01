package PA06;

public abstract class Person {
	String firstName; // example, Jim
	String lastName; // example, Miller
	Address address;  
	String phoneNumber; // example, (970) 421-1212. No need to code to verify the format of the phone number, other than it not being blank, or not empty
	String emailAddress; // example, jim@gmail.com. No need to code to verify the format of the email address, other than it not being blank, or not empty

	public static int numberOfPersons=0; 
	
    // add the constructor with data fields
	public Person(String firstName, String lastName, Address address, String phoneNumber, String emailAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	// increment the numberOfPersons by 1 for each time the constructor is called from the subclases 
	Person(){
		numberOfPersons++;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public static int getNumberOfPersons() {
		return numberOfPersons;
	}
	public static void setNumberOfPersons(int numberOfPersons) {
		Person.numberOfPersons = numberOfPersons;
	}
	// This is an abstract method
	@Override
	public String toString() {
		return "Person =" + firstName + lastName + address + phoneNumber + emailAddress;
	}
	
}
