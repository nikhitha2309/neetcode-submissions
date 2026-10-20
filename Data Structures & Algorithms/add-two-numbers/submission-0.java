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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode prevNode = null;
        int overhead = 0;
        while(l1 != null && l2 != null){
            if(head== null){
                int val = l1.val + l2.val;
                if(val > 9){
                    overhead = 1;
                    
                }
                ListNode node = new ListNode((val%10));
                head = node ;
                prevNode = node;

            }else{
                int val = l1.val + l2.val + overhead;
                if(val > 9){
                    overhead = 1;
                    
                }else{
                    overhead = 0;
                }
                ListNode node = new ListNode((val%10));
                prevNode.next = node;
                prevNode = node;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        
        while(l1!= null){
            int val = l1.val+overhead;
            if(val > 9){
                    overhead = 1;
                    
                }else{
                    overhead = 0;
                }
            ListNode node = new ListNode((val%10));
            prevNode.next = node;
            prevNode = node;
            l1 = l1.next;

        }
        while(l2!= null){
            int val = l2.val+overhead;
            if(val > 9){
                    overhead = 1;
                    
                }else{
                    overhead = 0;
                }
            ListNode node = new ListNode((val%10));
            prevNode.next = node;
            prevNode = node;
            l2 = l2.next;

        }

        if(l1 == null && l2 == null && overhead == 1){
            ListNode node = new ListNode(1);
            prevNode.next = node;
        }

        return head;
        
    }
}
