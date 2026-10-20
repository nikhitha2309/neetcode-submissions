/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if(root == null){
            return list;
        }
        
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list1 = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poppedNode = queue.poll();
                list1.add(poppedNode.val);
                if(poppedNode.left != null){
                    queue.add(poppedNode.left);
                } 
                if (poppedNode.right!= null) {
                    queue.add(poppedNode.right);
                }
            }
            list.add(list1);
        }
        return list;
        
    }
}
