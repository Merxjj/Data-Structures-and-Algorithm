public class LL {
   class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
   }
    
   public  Node head;
   public  Node tail;
//
   public void addFirst(int data){
   Node newNode = new Node(data);

    if (head == null){
        head = tail = newNode;

    }else{
        newNode.next = head ;
        head = newNode;
    }
    return ;

//
   }

   public void addLast(int data){
    Node newNode = new Node(data);


    if(head == null){
        head = newNode;

    }else{
        Node temp = head;

        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

   }

//
   public int size(){
    int i = 0;
    Node temp = head;
    while(temp!= null){
        temp = temp.next ;
        i++;

    }
    return i;
   }





//
   public void printLL(){
    if(head == null){
        System.out.println("Empty ");
    }
    Node temp = head;
    while (temp.next!= null){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
    System.out.println(temp.data);
   return;
}
//
    public void add(int idx, int data){
        Node newNode = new Node(data);
        Node temp  = head;

        if(idx == 0){
            addFirst(data);
        }
        int i = 0;

        while(i != idx){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

//
    public int removeFirst(){
        if(head== null){
            return Integer.MIN_VALUE;
        }
        int temp = head.data;
        head = head.next;

        return temp;

    }

    //
    public void removeLast(){
        if(head == null){
            System.out.println("No elements");
        }else if(head.next == null){
            System.out.println("removed element is"+head.data);
            head = null; 
        }else{
        Node temp = head;
        while(temp.next.next!= null){
            temp= temp.next;
        }
        System.out.println("removed element is "+ temp.next.data);
        temp.next = null;}

    }
//
    public int itrSearch(int key){

        if(head == null){
            return -1;
        }
        int i = 0;
        Node temp = head;
        while(temp.data!= key){
            temp = temp.next;
            if(temp == null){
                return -1;
            }
            i++;

        }
        return i;
        
        
    }

//
    public int recSearch(int key){
        return helper(head,key , 0);
    }
    public int helper(Node head, int key , int idx){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return idx;
        }
        return helper(head.next ,  key , idx+1);
    }


//
    public void revers(){
        if (head == null ) return;
        Node current = tail = head;
        Node next;
        Node prev = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        head = prev;

    }

public int deleteNode(int node) {
    if (head == null) {
        System.out.println("no elements");
        return -1;
    }

    Node temp = head;
    int size = 0;

    // Step 1: Count the nodes
    while (temp != null) {
        temp = temp.next;
        size++;
    }

    if (node > size || node <= 0) {
        System.out.println("invalid node number");
        return -1;
    }

    // Step 2: Special case - delete head
    if (node == size) {
        int data = head.data;
        head = head.next;
        return data;
    }

    // Step 3: Move to the node before the one to delete
    temp = head;
    for (int i = 1; i < size - node; i++) {
        temp = temp.next;
    }

    // Step 4: Delete the node
    int data = temp.next.data;
    temp.next = temp.next.next;
    return data;
}

public int palindrome() {
    if (head == null || head.next == null) return 1;

    Node slow = head, fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    Node secondHalf = reverse(slow);
    Node firstHalf = head;

    while (secondHalf != null) {
        if (firstHalf.data != secondHalf.data) return 0;
        firstHalf = firstHalf.next;
        secondHalf = secondHalf.next;
    }

    return 1;
}

private Node reverse(Node node) {
    Node prev = null, curr = node, next = null;

    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    return prev;
}


   public static void main(String[] args) {

   LL ll = new LL();
   ll.addFirst(12);
   ll.addFirst(13);
   ll.printLL();
   ll.addLast(14);
   System.out.println();
   ll.printLL();
   System.out.println(ll.size());
   ll.add(2,15);
   ll.printLL();
   System.out.println(ll.removeFirst());
   ll.printLL();
   ll.addFirst(14);
   ll.printLL();
   ll.removeLast();
   ll.printLL();
   System.out.println(ll.itrSearch(14));
   System.out.println(ll.recSearch(14));
   ll.revers();
   ll.printLL();
   System.out.println(ll.deleteNode(2));
   ll.printLL();
   System.out.println(ll.palindrome());
   ll.detectCycle();
   ll.addFirst(54);
   ll.printLL();
   ll.head = ll.mergeSort(ll.head);
   ll.printLL();






   }

// detect cycle

public void detectCycle(){
    Node slow = head;
    Node fast = head;

    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            System.out.println("Cycle Exist");
            return;

        }
    }
    System.out.println("Cycle does not Exist");
}

// remove a cycle in a linkedlist

   public void removeCycle() {
    Node slow = head;
    Node fast = head;
    boolean hasCycle = false;

    // Step 1: Detect cycle using Floyd's Cycle Detection Algorithm
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) { // Cycle detected
            hasCycle = true;
            break;
        }
    }

    // Step 2: If a cycle is detected, proceed to remove it
    if (hasCycle) {
        Node prev = null;
        slow = head;

        // Case 1: Cycle starts at the head
        if (slow == fast) {
            prev = fast;
            fast = fast.next;
            // Find the last node in the cycle
            while (fast != slow) {
                prev = fast;
                fast = fast.next;
            }
        } else {
            // Case 2: Cycle starts somewhere after the head
            while (slow != fast) {
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }
        }

        // Break the cycle
        prev.next = null;
    }
}

  // merge sort on linked list

  public Node mergeSort(Node head){

    if(head == null || head.next == null){
        return head;
    }

    Node mid = getMid(head);
    Node rightHead = mid.next;
    mid.next = null;
    Node newLeft = mergeSort(head);
    Node newRight = mergeSort(rightHead);

    return merge(newLeft,newRight);


  }

  public Node merge(Node left, Node right){

    Node mergedLL = new Node(-1);
    Node temp = mergedLL;

    while(left!= null && right!= null){

        if(left.data<right.data){
            temp.next = left;
            temp= temp.next;
            left = left.next;
        }else{
            temp.next = right;
            temp = temp.next;
            right = right.next;
            
        }
    }
    while(left!=null){
        temp.next = left;
        left = left.next;
        temp = temp.next;
    }
    while(right!= null){
        temp.next = right;
        right = right.next;
        temp = temp.next;
    }
    return mergedLL.next;


  }

  public Node getMid(Node head){
    Node slow = head;
    Node fast = head;
    while(fast!= null && fast.next!= null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
  }



  //Zig Zag Linked List 
  // 1 2 3 4 5 
  // output  1 5 2 4 3 

  public void zigZag(){
    Node mid = getMid(head);
    Node reverseHead = reverse(mid.next);
    mid.next = null;
    Node leftHead = head;
    Node nextL = null;
    Node nextR = null;
    Node rightHead = reverseHead;

    while(leftHead!= null && reverseHead!= null){

        nextL = leftHead.next;
        leftHead.next = rightHead;

        nextR = rightHead.next;
        rightHead.next = nextL;
        
        leftHead = nextL;
        rightHead = nextR;
        
        
    }
  }

}



