package PA06;

public class Faculty extends Person{
	

	
	private String rankOfFaculty; // values are Lecturer, Assistant Professor, Associate professor, Professor
	//int result = Integer.parseInt(rankOfFaculty);
	static final int Lecturer = 1;
	static final int AssistantProfessor = 2;
	static final int AssociateProfessor = 3;
	static final int Professor = 4;
	
	//private MyDate appointmentDate;
	
	public Faculty(String firstName, String lastName, Address address, String phoneNumber, String emailAddress, String rankOfFaculty){
		// call the super class constructor to pass the Person data fields	
		super(firstName, lastName, address, phoneNumber, emailAddress);
		this.rankOfFaculty = rankOfFaculty; // values are Lecturer, Assistant Professor, Associate Professor, Professor
		//this.appointmentDate = appointmentDate;		
	}

	// Override the abstract method from Person
	
	
	public String getRankOfFaculty() {
		return rankOfFaculty;
	}
	@Override
	public String toString() {
		return "Faculty =" + firstName + lastName + address + phoneNumber + emailAddress + rankOfFaculty;
	}

	public void setRankOfFaculty(String rankOfFaculty) {
		this.rankOfFaculty = rankOfFaculty;
	}

}
