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
    public TreeNode invertTree(TreeNode root) {
        invertTreeHelper(root);
        return root;
    }

    public static void invertTreeHelper(TreeNode node){
        if(node == null){
            return;
        }else{
            TreeNode left = node.left;
            node.left = node.right;
            node.right = left;
            invertTreeHelper(node.left);
            invertTreeHelper(node.right);
        }
    }
}
