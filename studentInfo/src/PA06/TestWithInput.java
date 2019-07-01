package PA06;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TestWithInput {
	
	static Person[] personArray;
	
	public static void main(String[] args) throws Exception {
	
		String street = null;
		int houseNumber = 0;
		String city = null;
		String state = null;
		int zipCode = 0;
		String firstName = null;
		String lastName = null;
		String phoneNumber = null;
		String emailAddress = null;
		String status = null;
		String rankOfFaculty = null;
		Address address = null;
		int numberOfPersons = 0;
		int personType = 0;
	
		try 
		{
				numberOfPersons = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter number of persons!"));
		}
		catch (Exception ex)
		{
			JOptionPane.showMessageDialog(null, "Please enter a number!");
		}
				
		personArray = new Person[numberOfPersons];
		
		for (int i = 0; i < numberOfPersons; i++)
		{
			try
			{
				personType = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter 1 if person is student or 2 if person is faculty"));
				if (personType != 1 && personType != 2)
					throw new Exception();
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(null, "Invalid input!");
			}								
			if (personType == 1)
			{
				firstName = JOptionPane.showInputDialog(null, "Please enter First Name of person!");
				if (firstName.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please enter a name!");
				}
						
				lastName = JOptionPane.showInputDialog(null, "Please enter Last Name of person!");
				if (lastName.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please enter a name!");
				}
				try
				{
					houseNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter House Number of person!"));
				}
				catch (Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Please enter a number!");
				}
				street = JOptionPane.showInputDialog(null, "Please enter Street Name of person!");
				if (street.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please enter Street Name");
				}
				city = JOptionPane.showInputDialog(null, "Please enter City of person!");
					if (city.isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Please enter a city!");
					}
				state = JOptionPane.showInputDialog(null, "Please enter State of person!");
					if (state.isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Please enter a state!");
					}
				try
				{
					zipCode = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter Zip Code of person!"));
				}
				catch (Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Please enter a zip code!");
				}						
				phoneNumber = JOptionPane.showInputDialog(null, "Please enter Phone Number of person!");
				if (phoneNumber.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please enter a phone number!");
				}
				emailAddress = JOptionPane.showInputDialog(null, "Please enter Email Address of person!");
				if (emailAddress.isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Please enter an address!");
					}
				status = JOptionPane.showInputDialog(null, "Please enter status of student! (1 = Freshman, 2 = Sophomore, 3 = Junior, 4 = Senior");
				if (status.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please enter a Status!");
				}
					
				addPerson(firstName, lastName, address, houseNumber, street, city, state, zipCode, phoneNumber, emailAddress, personType, status, rankOfFaculty);
			}//end if loop for personType 1
			else
			{
				firstName = JOptionPane.showInputDialog(null, "Please enter First Name of person!");
				if (firstName.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please enter a name!");
				}
				lastName = JOptionPane.showInputDialog(null, "Please enter Last Name of person!");
				if (lastName.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please enter a name!");
				}
				try
				{
					houseNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter House Number of person!"));
				}
				catch (Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Please enter a number!");
				}
				street = JOptionPane.showInputDialog(null, "Please enter Street Name of person!");
				if (street.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please enter Street Name");
				}
				city = JOptionPane.showInputDialog(null, "Please enter City of person!");
				if (city.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please enter a city!");
				}
				state = JOptionPane.showInputDialog(null, "Please enter State of person!");
				if (state.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please enter a city!");
				}
				try
				{
					zipCode = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter Zip Code of person!"));
				}
				catch (Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Please enter a zip code!");
				}						
				phoneNumber = JOptionPane.showInputDialog(null, "Please enter Phone Number of person!");
				if (phoneNumber.isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Please enter a phone number!");
					}
				emailAddress = JOptionPane.showInputDialog(null, "Please enter Email Address of person!");
				if (emailAddress.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please enter an address!");
				}
				rankOfFaculty = JOptionPane.showInputDialog(null, "Please enter Rank of Faculty! (1 = Lecturer, 2 = Assistant Professor, 3 = Associate Professor, 4 = Professor");
				if (rankOfFaculty.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please enter an rank!");
				}
						//appointmentDate = JOptionPane.showInputDialog(null, "Please enter appointment date");
						
						
				addPerson(firstName, lastName, address, houseNumber, street, city, state, zipCode, phoneNumber, emailAddress, personType, status, rankOfFaculty);
			}//end of else loop									
		}//end for loop
		display();
				
	}	

	public static void addPerson(String firstName, String lastName, Address address, int houseNumber, String street, String city, String state, int zipCode, String phoneNumber, String emailAddress, int personType, String status, String rankOfFaculty)
	{
		if (Person.getNumberOfPersons() < personArray.length)
		{
			Address address1 = new Address(houseNumber, street, city, state, zipCode);
			if (personType == 1)
			{
				Person person1 = new Student (firstName, lastName, address1, phoneNumber, emailAddress, status);
				personArray[0] = person1;
			}
			else
			{
				Person person2 = new Faculty (firstName, lastName, address1, phoneNumber, emailAddress, rankOfFaculty);
				personArray[1] = person2;
			}			
//			if (personType == 1)
//				personArray[Person.getNumberOfPersons()] = new Student(firstName, lastName, address, phoneNumber, emailAddress, null);
//			else
//				personArray[Person.getNumberOfPersons()] = new Faculty(firstName, lastName, address, phoneNumber, emailAddress, null, appointmentDate);
		}
		else
		{
			JOptionPane.showMessageDialog(null,  "The array of persons is full.");
		}
	}
	
	public static void display()
	{
		String message1 = "Name\t" + "Phone Number\t" + "Email Address\t" + "Address\t" + "status\t";
		String message2 = "Name\t" + "Phone Number\t" + "Email Address\t" + "Address\t" + "status\t";
		for (int i = 0; i < personArray.length; i++)
			message1 += "\n" + personArray[0].toString() + "\n";
		JOptionPane.showMessageDialog(null, new JTextArea(message1), null, JOptionPane.INFORMATION_MESSAGE);
		for (int i = 0; i < personArray.length; i++)
			message2 += "\n" + personArray[1].toString() + "\n";
		JOptionPane.showMessageDialog(null, new JTextArea(message2), null, JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	
}
