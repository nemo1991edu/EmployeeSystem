package employee;
import java.time.LocalDate;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private LocalDate startDate;
	public final String DEFAULT_STRING = "Unknown";
	public abstract double calculateIncome();
	
	//constructor
	public Employee(String firstName, String lastName, String email, String phoneNumber, LocalDate startDate) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setPhoneNumber(phoneNumber);
		setStartDate(startDate);
	}
	
	//getters
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	
	// setters
	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else {
			this.firstName = DEFAULT_STRING;
		}
	}
	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else {
			this.lastName =DEFAULT_STRING;
		}
	}
	public void setEmail(String email) {
		if (!email.isEmpty() && !email.equalsIgnoreCase(null)) {
			this.email = email;
		} else {
			this.email = DEFAULT_STRING;
		}
	}
	public void setPhoneNumber(String phoneNumber) {
		if (!phoneNumber.isEmpty() && !phoneNumber.equalsIgnoreCase(null)) {
			this.phoneNumber = phoneNumber;
		} else {
			this.phoneNumber = DEFAULT_STRING;
		}
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
}