import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        // Access a value by key
        System.out.println(map.get("Apple")); // Output: 10

        // Check if a key exists
        System.out.println(map.containsKey("Banana")); // Output: true

        // Check if a value exists
        System.out.println(map.containsValue(30)); // Output: true

        // Remove a key
        map.remove("Banana");

        // Iterate over keys
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        // Iterate over entries (key-value pairs)
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Size of the map
        System.out.println("Size: " + map.size());

        // Clear all entries
        map.clear();
    }
}
