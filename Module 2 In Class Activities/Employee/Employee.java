public class Employee {
    // Attributes of the Employee class
    private String name;
    private String jobTitle;
    private double salary;

    // Constructor to initialize the Employee object
    public Employee (String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getter method for the name ttribute
    public String getName() {
        return name;
    }
    // Setter method for the name attribute
    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to calculate the annual salary
    public double calculateAnnualSalary() {
        return salary * 12; // Annual salary forumla: Monthly salary * 12
    }

    // Method to give a raise by percentage
    public void giveRaise(double percentage) {
        salary += salary * (percentage) / 100; // Formula to increase salary by a percentage
    }

    public static void main(String[] args) {
        // Create an instance of the employee class
        Employee employee = new Employee("Kevin Le", "Software Engineer", 5000.00);

        // Print the initial details of the employee
        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Monthly Salary: " + employee.getSalary());
        System.out.println("Annual Salary: " + employee.calculateAnnualSalary());

        // Give the employee a 10% raise
        employee.giveRaise(10);

        // Print updated details of the employee
        System.out.println("\nAfter 10% Raise: ");
        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Monthly Salary: " + employee.getSalary());
        System.out.println("Annual Salary: " + employee.calculateAnnualSalary());
    }
}
