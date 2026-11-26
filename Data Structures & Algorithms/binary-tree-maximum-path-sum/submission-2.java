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
        public int maxSum = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {

        maxPathSum2(root);
        return maxSum;

    }
    


    public int maxPathSum2(TreeNode node) {
        if(node == null){
            return 0;
        }
        
        int leftSum = Math.max(0,maxPathSum2(node.left));
        int rightSum = Math.max(0,maxPathSum2(node.right));
        
        int maxSumLocal = leftSum + rightSum + node.val;
        int maxSumPath = Math.max(leftSum,rightSum) + node.val ; 
        if(Math.max(maxSumLocal,maxSumPath) > maxSum ){
            maxSum = Math.max(maxSumLocal,maxSumPath);
        }
        return maxSumPath;
        
    }
}
