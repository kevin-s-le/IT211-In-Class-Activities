public class Circle {
    // Attributes of the Circle class
    private double radius;

    // Constructor to initialize the Circle object
    public Circle(double radius) {
        this.radius = radius; // Set the radius attribute
    }

    // Getter Method for the radius
    public double getRadius() {
        return radius;
    }

    // Setter Method for the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // Method to calculate the area of the Circle
    public double calculateArea() {
        return Math.PI * radius * radius; // Area formula of a circle
    }

    // Method to calculate the circumference of the Circle
    public double calculateCircumference() {
        return (Math.PI * 2) * radius; // Circumference formula of a circle
    }
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        
        // Print the initial radius of the Circle
        System.out.println("The radius of the circle is " + circle.getRadius() + ".");
        // Calculate the area of the Circle
        double area = circle.calculateArea();
        System.out.println("The area of the circle is " + area + ".");
        // Calculate the circumference of the Circle
        double circumference = circle.calculateCircumference();
        System.out.println("The circumference of the circle is " + circumference + ".");

        // Modify the radius of the circle
        circle.setRadius(7.5);
        // Print the updated radius of the circle
        System.out.println("Updated radius is: " + circle.getRadius() + ".");
        // Calculate the updated area of the circle
        area = circle.calculateArea();
        System.out.println("Updated area of the circle is: " + area + ".");
        // Calculate the updated circumference of the circle
        circumference = circle.calculateCircumference();
        System.out.println("Updated circumference of the circle is: " + circumference + ".");
    }
}