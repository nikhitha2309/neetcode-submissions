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

    public int counter = 0;
    public int kthSmallest(TreeNode root, int k) {

        TreeNode node = findSmallest(root,k);
        return node.val;
        
    }

    public TreeNode findSmallest(TreeNode root, int k) {

        if(root == null){
            return null;
        }

        TreeNode left = findSmallest(root.left,k);
        if(left!= null){
            return left;
        }
        counter++;
        if(counter == k){
            return root;
        }
        TreeNode right = findSmallest(root.right,k);
        if(right!= null){
            return right;
        }
        return null;

        
    }
}
