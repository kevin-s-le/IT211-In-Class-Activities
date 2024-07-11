package TrafficLight;
public class Main {
    public static void main (String[] args) {
        // Step 5: Create and instance of TrafficLight
        TrafficLight trafficLight = new TrafficLight("Red", 30);
        // Display initial state
        System.out.println("Initial Traffic Light State:");
        System.out.println("Color: " + trafficLight.getColor() + ".");
        System.out.println("Duration: " + trafficLight.getDuration() + " seconds.");
        // Check if the light is red
        System.out.println("\nIs this light red? " + trafficLight.isRed());
        // Change the color to green
        trafficLight.changeColor("Green");
        System.out.println("\nUpdated the Traffic Light State:");
        System.out.println("color: " + trafficLight.getColor() + ".");
        System.out.println("Duration: " + trafficLight.getDuration() + " seconds.");
        // Check if the light is green
        System.out.println("\nIs this light green? " + trafficLight.isGreen());
    }
}