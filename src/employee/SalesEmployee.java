package employee;
import java.time.LocalDate;
public class SalesEmployee extends Employee{
	private double commissionRate;
	private double totalSales;
	public SalesEmployee(String firstName, String lastName, String email, String phoneNumber, LocalDate startDate, double commissionRate, double totalSales) {
		super(firstName, lastName, email, phoneNumber, startDate);
		setCommissionRate(commissionRate);
		setTotalSales(totalSales);
	}
	
	//getters
	public double getCommissionRate() {
		return commissionRate;
	}
	public double getTotalsales() {
		return totalSales;
	}
	
	//setters
	public void setCommissionRate(double commissionRate) {
		if (commissionRate > 0) {
			this.commissionRate = commissionRate;
		} else {
			this.commissionRate = 0;
		}
	}
	public void setTotalSales(double totalSales) {
		if (totalSales > 0) {
			this.totalSales = totalSales;
		} else {
			this.totalSales = 0;
		}
	}
	
	public String toString() {
		return "The total income is $" + calculateIncome();
	}

	public double calculateIncome() {
		return (commissionRate * totalSales) / 100;
		
	}	
}