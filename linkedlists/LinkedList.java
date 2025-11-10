// 1 add first
// 2 add last 
// 3 print all elements
// get size of a linked list , we can also make a static variable to track size of ll 
// which is also implemented in this code
// 4 remove first 
// this linked list is only for singly linked list

public class LinkedList {


    class Node{
        int data ;
        Node next ;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size ;
    /*
      Static variables mean shared across all LinkedList instances. If you make multiple objects of LinkedList, they’ll all point to the same list. This may not be what you want. Use non-static instead unless sharing is intentional.
     */


    public void addFirst(int data){  //1
        Node newNode = new Node(data);
        if(head == null ) {

        head = tail = newNode ;
        size++;
        return ;
        }

        newNode.next = head;
        head = newNode;
        size++;


    }

    public  void addLast(int data){//2
        size++;

        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return ;
        }
        tail.next = newNode;
        tail = newNode;



    }

    //3
    public void printll(){
        if(head == null){
            System.out.println("Empty linked List");

        }
        Node temp = head;
        while(temp.next !=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println(temp.data+"->");
        System.out.println("null");
    }
    //4
    public int size(){
        Node temp = head;
        int i= 0;
        while (temp != null){
            temp = temp.next;
            i++;
        }
        return i;
    }

    public void add(int idx, int data){
        size++;
        if(idx == 0 ){ addFirst(data);
            return ;}
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }
//5
    public int  removefirst(){
        if(head == null) {
            return Integer.MIN_VALUE;}
            int value = head.data;
            head = head.next;
            size--;
        return value;
    }
//6
    public int removeLast(){
        if(head == null) return Integer.MIN_VALUE;
        if(size == 1){
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }
        Node temp = head;
        while(temp.next != tail && temp.next != null){
            temp = temp.next;
        }
        int value = tail.data;
        tail = temp;
        
        tail.next = null;   
        size--;
        return value;
    }

    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp.data!=key){
            if(temp.next == null) return -1;
            temp= temp.next;
            i++;
        }
        return i;
    }

    // 7
    public int recSearch(int key) {
        return helper(head, key, 0);
    }
    
    private int helper(Node head, int key, int index) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return index;
        }
        return helper(head.next, key, index + 1);
    }
    
//8
    //reverse a linked list
  public void reverse() {
    Node prev = null;
    Node current = tail = head;
    Node next;
    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next; // Use 'next' to move forward
    }
    head = prev;
}


//find and remove nth node from end 
// size-n+1

public void deleteNode(int n) {
    if (head == null) {
        return; // Empty list, nothing to delete
    }

    if (n > size || n <= 0) {
        return; // Invalid index
    }

    // Deleting the head (nth node from end is first node)
    if (n == size) {
        head = head.next;
        size--;
        return;
    }

    Node temp = head;
    Node prev = null;
    int targetIndex = size - n; // Convert nth from end to 0-based index

    for (int i = 0; i < targetIndex; i++) {
        prev = temp;
        temp = temp.next;
    }

    if (prev != null) {
        prev.next = temp.next;
    }

    if (temp == tail) {
        tail = prev;
    }

    size--;
}

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.printll();
        ll.add(2, 3);
        ll.printll();
        System.out.println(ll.size());
        System.out.println(ll.removefirst());
        System.out.println(ll.removeLast());
        System.out.println(ll.itrSearch(1));
        ll.reverse();
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println("reversed linked list is : ");
        ll.printll();
    }
    
}
