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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;
        ListNode slow = null;
        for(int i=0; i< n ; i++){
            if(fast!= null){
                fast = fast.next;
            }
        }

        while(fast!= null){
            if(slow == null){
                slow = head;
            }else{
                slow = slow.next;
            }
            fast = fast.next;
        }

        if(slow == null){
            return head.next;
        }
        ListNode next = slow.next.next;
        slow.next = next;
        return head;

    }
}
