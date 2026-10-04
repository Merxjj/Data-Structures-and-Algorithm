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
    public ListNode reverseKGroup(ListNode head, int k) {
        //check if the size exist
        ListNode temp  = head;
        for(int i = 0;i<k;i++){
            if(temp == null)return head;
            temp = temp.next;
        }

        //Reverse k nodes

        ListNode curr = head;
        ListNode prev = null;
        for(int i = 0;i<k;i++){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = reverseKGroup(curr,k);
        return prev;
    }
}