package employee;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
public class Driver {
	public static void printInformation(ArrayList<Employee> emp) {
		final String DIV = "--------------------------------------------";
		for (Employee e : emp) {
			System.out.println(DIV + "\nName:\t\t" + e.getFirstName() + " " + e.getLastName() + "\nEmail:\t\t" +
								e.getEmail() + "\nPhone#:\t\t" + e.getPhoneNumber() +
								"\nStart Date:\t" + e.getStartDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)) + "\n-->" + e.toString());
		}
		System.out.println(DIV);
	}

	public static void main(String[] args) {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		HourlyEmployee he1 = new HourlyEmployee("Edu", "Riva", "edu@gmail.com", "111-222-3333", LocalDate.of(2016, 8, 20), 15.4, 40);
		HourlyEmployee he2 = new HourlyEmployee("Dave", "Pro", "dave@gmail.com", "444-555-6666", LocalDate.of(2019, 7, 10), 25.8, 30);
		SalesEmployee se1 = new SalesEmployee("Ted", "Mosby", "ted@gmail.com", "777-888-9999", LocalDate.of(2017, 10, 10), 12.5, 1583.5);
		SalesEmployee se2 = new SalesEmployee("Marshall", "Erickson", "marshall@gmail.com", "123-456-7890", LocalDate.of(2020, 8, 31), 10.0, 1825.5);
		employeeList.add(he1);
		employeeList.add(he2);
		employeeList.add(se1);
		employeeList.add(se2);
		printInformation(employeeList);
	}
}
