import java.util.*;




public class Distance  {
    // Data members for feet and inches for two distances
    int f1, inc1; // First distance (feet and inches)
    int f2, inc2; // Second distance (feet and inches)
    // Constructor to initialize the distances
    public Distance(int a, int b, int c, int d) {
    f1 = a;
    inc1 = b;
    f2 = c;
    inc2 = d;
    }
    // Method to display the distances
    public void showDistance() {
    System.out.println("Distance 1: " + f1 + " feet " + inc1 + " inches");
    System.out.println("Distance 2: " + f2 + " feet " + inc2 + " inches");
    }
    // Method to calculate and display the sum of the distances
    public void sumDistance() {
    int totalFeet, totalInches;
    // Add inches and handle conversion to feet if necessary
    totalInches = inc1 + inc2;
    totalFeet = f1 + f2 + (totalInches / 12); // Convert inches to feet if over 12
    totalInches %= 12; // Remaining inches
    // Display the result
    System.out.println("Sum of Distances: " + totalFeet + " feet " + totalInches + " inches");
    }
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the feet and inches ");
    System.out.println("Enter the feet");
    int x = sc.nextInt();
    System.out.println("Enter the inches");
    int y = sc.nextInt();
    System.out.println("Enter the feet");
    int z = sc.nextInt();
    System.out.println("Enter the inches");
    int a = sc.nextInt();
    // Create an object of Distance class with the given values
    Distance d = new Distance(x,y,z,a);
    // Display the distances
    d.showDistance();
    // Display the sum of the distances
    d.sumDistance();
    sc.close();
    }
    }