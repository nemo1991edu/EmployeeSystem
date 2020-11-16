package employee;
import java.time.LocalDate;

public class HourlyEmployee extends Employee{
	
	private double payRate;
	private int hoursWorking;
	
	public HourlyEmployee(String firstName, String lastName, String email, String phoneNumber, LocalDate startDate, double oayRate, int hoursWorking) {
		super(firstName, lastName, email, phoneNumber, startDate);
		setPayRate(oayRate);
		setHoursWorking(hoursWorking);
	}
	
	//getters
	public double getPayRate() {
		return payRate;
	}
	public int getHoursWorking() {
		return hoursWorking;
	}
	
	//setters
	public void setPayRate(double payRate) {
		if (payRate > 0) {
			this.payRate = payRate;
		} else {
			this.payRate = 0;
		}
	}
	
	public void setHoursWorking(int hoursWorking) {
		if (hoursWorking >= 0 && hoursWorking <= 40) {
			this.hoursWorking = hoursWorking;
		} else {
			this.hoursWorking = 0;
		}
	}
	
	public String toString() {
		return "The total income is $" + calculateIncome();
	}

	public double calculateIncome() {
		return  payRate * hoursWorking;	
	}
}