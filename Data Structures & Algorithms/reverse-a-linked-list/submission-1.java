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
    public ListNode reverseList(ListNode head) {

        ListNode temp = head;
        ListNode prevNode = null;
        while(temp!= null){
            ListNode tempNextNode = temp.next;
            temp.next = prevNode;
            prevNode = temp;
            temp = tempNextNode;
        }
        return prevNode;
        
    }
}
