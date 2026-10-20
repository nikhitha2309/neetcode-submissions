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

        ListNode newHead = null;
        ListNode tempHead = head;
        ListNode prevEnd = null;
        while(tempHead != null){
            ListNode start = tempHead;
            ListNode currStart = tempHead;
        
            for(int i = 0; i<k;i++){
                if(tempHead == null){
                    if(newHead!= null){
                        return newHead;
                    }else{
                        return head;
                    }
                }
                tempHead = tempHead.next;
            }
            //Reverse in k group
            ListNode next = tempHead;
            ListNode tempPrevEnd = null;
            for(int i = 0; i<k;i++){
                if(tempPrevEnd == null){
                    tempPrevEnd = start;
                }
                ListNode temp = start.next;
                start.next = next;
                next = start;
                start = temp;
            }
            if(newHead == null){
                newHead = next;
            }
            if(prevEnd != null){
                prevEnd.next = next;
            }

            prevEnd = tempPrevEnd;
        }
        if(newHead != null){
            return newHead;
        }
        return head;
        
    }
}
