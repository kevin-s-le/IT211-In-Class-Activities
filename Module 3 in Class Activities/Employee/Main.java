package Employee;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Step 5: Create an instance of Employee class abd test its functionality
        Employee employee = new Employee("Haylee Beckham", 50000, LocalDate.of(2015, 6, 1));
        // Display employee details
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getName() + ".");
        System.out.println("Salary: $" + employee.getSalary() + " per year.");
        System.out.println("Hire Date: " + employee.getHireDate() +".");
        // Calculate for years of service
        System.out.println("\nYears of service: " + employee.calculateYearsOfService() + ".");
    }
}