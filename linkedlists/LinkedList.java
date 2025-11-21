public class LinkedList {

    // 1. addFirst(int data) - adds a node at the beginning of the linked list
    // 2. addLast(int data) - adds a node at the end of the linked list
    // 3. add(int index, int data) - adds a node at a specific index
    // 4. removeFirst() - removes and returns the first node
    // 5. removeLast() - removes and returns the last node
    // 6. size() - returns the number of nodes in the linked list
    // 7. search(int key) - searches for a value iteratively, returns index or -1
    // 8. reverse() - reverses the linked list
    // 9. deleteNthFromEnd(int n) - deletes the nth node from the end of the list
    // 10. printList() - prints all elements of the linked list in order
    // Node class representing each element
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // Add element at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Add element at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Add element at a specific index
    public void add(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // Remove first element
    public int removeFirst() {
        if (head == null) throw new RuntimeException("List is empty");
        int value = head.data;
        head = head.next;
        if (head == null) tail = null; // List became empty
        size--;
        return value;
    }

    // Remove last element
    public int removeLast() {
        if (head == null) throw new RuntimeException("List is empty");
        if (size == 1) {
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        int value = tail.data;
        tail = temp;
        tail.next = null;
        size--;
        return value;
    }

    // Get size of linked list
    public int size() {
        return size;
    }

    // Search iteratively, returns index or -1
    public int search(int key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == key) return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }

    // Reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        tail = head; // Update tail
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Delete nth node from the end
    public void deleteNthFromEnd(int n) {
        if (n <= 0 || n > size) return;
        if (n == size) {
            head = head.next;
            if (head == null) tail = null;
            size--;
            return;
        }
        Node temp = head;
        for (int i = 0; i < size - n - 1; i++) {
            temp = temp.next;
        }
        if (temp.next == tail) tail = temp;
        temp.next = temp.next.next;
        size--;
    }

    // Print linked list
    public void printList() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Test the LinkedList
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.add(1, 5);
        ll.printList(); // 2 -> 5 -> 1 -> 3 -> null

        System.out.println("Size: " + ll.size());
        System.out.println("Removed first: " + ll.removeFirst());
        System.out.println("Removed last: " + ll.removeLast());
        ll.printList();

        ll.reverse();
        System.out.println("Reversed list:");
        ll.printList();

        ll.deleteNthFromEnd(2);
        System.out.println("After deleting 2nd node from end:");
        ll.printList();

        System.out.println("Search 5: " + ll.search(5));
        System.out.println("Search 100: " + ll.search(100));
    }
}
