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

    public int max ;
    public int diameterOfBinaryTree(TreeNode root) {
        max = 0;
        diameter(root);
        return max;
        
    }

    public int diameter(TreeNode node ){
            if(node.left == null && node.right == null){
                return 1;
            }
            int lenLeft = 0;
            int lenRight = 0;
            if(node.left != null){
                lenLeft = diameter(node.left);
            }

            if(node.right != null){
                lenRight = diameter(node.right);
            }


            int length = lenLeft + lenRight;
            if(length > max){
                max = length;
            }
            return Math.max(lenLeft,lenRight)+1;
    }
}
