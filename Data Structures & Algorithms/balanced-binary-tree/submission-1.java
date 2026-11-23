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
    public boolean isBalanced(TreeNode root) {
        if(height(root) == -1){
            return false;
        }
        return true;
    }

    public int height(TreeNode node){
        if(node == null){
            return 0;
        }
        if(( node.left == null && node.right == null)){
            return 1;
        }


        int leftSubTree = height(node.left);
        if(leftSubTree == -1){
            return -1;
        }
        int rightSubTree = height(node.right);
        if(rightSubTree == -1){
            return -1;
        }
        if((Math.abs(leftSubTree-rightSubTree) > 1)){
            return -1;
        }

        return Math.max(leftSubTree,rightSubTree) + 1;
    }
}
