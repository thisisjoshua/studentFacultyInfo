
package PA06;

public class Student extends Person{
	

	private String status; // Values are Freshman, Sophomore, Junior, Senior 
	//int result = Integer.parseInt(status);
	static final int Freshman = 1;
	static final int Sophomore = 2;
	static final int Junior = 3;
	static final int Senior = 4;
	
	public Student(String firstName, String lastName, Address address, String phoneNumber, String emailAddress, String status){
		// call the super class constructor to pass the Person data fields	
		super(firstName, lastName, address, phoneNumber, emailAddress);		
		this.status = status;
	}
	
	// Override the abstract method from Person
	@Override
	public String toString() {
		return "Student =" + firstName + lastName + address + phoneNumber + emailAddress + status;
	}

	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}
