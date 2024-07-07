public class Person {
    // Attributes of the Person class
    private String name;
    private int age;
    // Constructor to initialize the person
    public Person(String name, int age) {
        this.name = name; // Set the name attribute
        this.age = age; // Set the age attribute
    }
    // Get method for the name attribute
    public String getName() {
        return name;
    }
    // Get method for the age attribute
    public int getAge() {
        return age;
    }
    // Set Main method
    public static void main(String[] args) {
        // Create the first instance of the person class
        Person person1 = new Person("Kevin", 28);
        // Create the second instance of the person class
        Person person2 = new Person("Dayah", 27);
    // Print the name and age of the first person
    System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge() + ".");
    // Print the name and age of the second person
    System.out.println("Name: " + person2.getName() + ", Age: " + person2.getAge() + ".");
    }
}