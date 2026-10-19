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
    public void reorderList(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(slow != null && fast != null){
            if(fast!= null && fast.next != null){
                fast = fast.next.next;
            }else{
                fast = null;
            }

            if(fast!= null){
                slow = slow.next;
            }
        }
        ListNode midNode = slow;

        ListNode prev = null;
        ListNode curr = midNode.next;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        midNode.next = prev;
        ListNode h1 = head;
        ListNode h2 = midNode.next;
        ListNode copyH3 = h2;
        while(h2 != null && h1 != midNode){
            ListNode h1Next = h1.next;       
            ListNode h2Next = h2.next;
            h1.next = h2;
            h2.next = h1Next;
            
            midNode.next = h2Next; 
              
            
            h2 = h2Next;
            h1 = h1Next;
        }
        
    }
}
