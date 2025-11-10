import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list); // [A, B, C]

        // Add at specific position
        list.add(1, "D"); 
        System.out.println(list); // [A, D, B, C]

        // Add to first and last
        list.addFirst("Start");
        list.addLast("End");
        System.out.println(list); // [Start, A, D, B, C, End]

        // Access elements
        System.out.println(list.get(2)); // A
        System.out.println(list.getFirst()); // Start
        System.out.println(list.getLast());  // End

        // Remove elements
        list.remove("D");
        list.removeFirst();
        list.removeLast();
        System.out.println(list); // [A, B, C]

        // Iterate
        for (String s : list) {
            System.out.println(s);
        }

        // Size
        System.out.println("Size: " + list.size());
    }
}
