public class Rectangle {
    // Attributes of the Rectangle class
    private double width;
    private double height;

    // Constructor to initialize the Rectangle object
    public Rectangle(double width, double height) {
        this.width = width; // Set the width attribute
        this.height = height; // Set the height attribute
    }

    // Get method for the Width attribute
    public double getWidth() {
        return width;
    }
    // Get method for the Height attribute
    public double getHeight() {
        return height;
    }

    // Main method
    public static void main(String[] args) {

        // Create the instance of the Rectangle class
        Rectangle rectangle = new Rectangle(15.2, 12);

        // Print the width and height of the rectangle
        System.out.println("Width: " + rectangle.getWidth() + " inches, Height: " + rectangle.getHeight() + " inches.");

        // Print the area of the rectangle
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("The area of the rectangle is: " + area + " inches.");

        // Print the perimeter of the rectangle
        double perimeter = (rectangle.getWidth() + rectangle.getHeight()) * 2;
        System.out.println("The perimeter of the rectangle is: " + perimeter + " inches.");
    }
}