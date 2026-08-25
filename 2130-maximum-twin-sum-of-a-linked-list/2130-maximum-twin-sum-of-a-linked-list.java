/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while(fast.next!= null && fast.next.next != null){ // find the mid of LL
        slow = slow.next ;
        fast = fast.next.next;
    }
    ListNode rightHead = slow.next;     //detact the right part of LL
    slow.next = null;

    ListNode prev = null;
    ListNode curr = rightHead;
    ListNode next = null;
    while(curr!= null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    rightHead = prev;
    ListNode temp1 = head;
    ListNode temp2 = rightHead;
    int maxSum = 0;
    while(temp1!=null){
        maxSum = Math.max(temp1.val + temp2.val , maxSum);
        temp1 = temp1.next;
        temp2 = temp2.next;
    }
    return maxSum;

        
    }
}