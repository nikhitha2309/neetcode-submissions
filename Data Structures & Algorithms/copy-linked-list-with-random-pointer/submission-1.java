/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node tempHead = head;
        Node copyHead = null;
        Node prevNode = null;
        HashMap<Node,Node> map = new HashMap<>();
        while(tempHead != null){
            Node node = new Node(tempHead.val);
            if(copyHead == null){
               copyHead = node; 
            }else{
                prevNode.next = node;
            }
            map.put(tempHead,node);

            prevNode = node;
            tempHead = tempHead.next;
        }

        tempHead= head;
        Node tempCopyHead = copyHead;
        while(tempHead!= null){
            Node rand = tempHead.random;
            if(rand == null ){
                tempCopyHead.random = null;
            }else{
                Node node = map.get(rand);
                tempCopyHead.random = node;
            }
            tempCopyHead = tempCopyHead.next;
            tempHead = tempHead.next;
        }

        return copyHead;

        
    }
}
