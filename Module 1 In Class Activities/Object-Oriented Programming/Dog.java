public class Dog {
    // Attributes of the Dog class
    private String name;
    private String breed;

    // Constructor to initialize the Dog object
    public Dog(String name, String breed) {
        this.name = name; // Set the name attribute
        this.breed = breed; // Set the age attribute
    }

    // Get method for the Name attribute
    public String getName() {
        return name;
    }

    // Setter method for the Name attribute
    public void setName(String Name) {
        this.name = Name;
    }

    // Get method for the Breed attribute
    public String getBreed() {
        return breed;

    }
    // Setter method for the Breed attribute
    public void setBreed(String Breed) {
        this.breed = Breed;
    }

    public static void main(String[] args) {

        // Create the first instance of the Dog class
        Dog dog1 = new Dog ("Benji", "Cavalier King Charles Spaniel");
        // Create the second instance of the Dog class
        Dog dog2 = new Dog ("Sketch", "(He's secretly a cat, not a dog)");

        // Print the name and breed of the first dog
        System.out.println("Name: " + dog1.getName() + ", Breed: " + dog1.getBreed() + ".");
        // Print the name and breed of the second dog
        System.out.println("Name: " + dog2.getName() + ", Breed: " + dog2.getBreed() + ".");

        // Modify the name and breed of the first dog
        dog1.setName("Jake");
        dog1.setBreed("Corgi");
        // Modify the name and breed of the second dog
        dog2.setName("Maki");
        dog2.setBreed("Austrailian Shepherd");

        // Reprint the name and breed of the first dog
        System.out.println("New name: " + dog1.getName() + ", new breed: " + dog1.getBreed() + ".");
        // Reprint the name and breed of the second dog
        System.out.println("New name: " + dog2.getName() + ", new breed: " + dog2.getBreed() + ".");
    }
}