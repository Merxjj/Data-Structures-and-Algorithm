import java.util.HashSet;

public class Hashset1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");  // Duplicate, ignored

        // Display elements
        System.out.println(set); // Output (order not guaranteed): [Apple, Banana, Orange]

        // Check if an element exists
        System.out.println(set.contains("Banana")); // true

        // Remove an element
        set.remove("Orange");

        // Iterate through the set
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Size of the set
        System.out.println("Size: " + set.size());

        // Clear all elements
        set.clear();
        System.out.println(set.isEmpty()); // true
    }
}
