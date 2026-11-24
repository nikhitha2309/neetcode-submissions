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
    public int goodNodes = 0;
    public int goodNodes(TreeNode root) {
        countGoodNodes(root,Integer.MIN_VALUE);
        return goodNodes;
        
    }

     public void countGoodNodes(TreeNode node , int max){
        int maxi = max;
        if(node.val >= max){
        
            goodNodes +=1;
            maxi = node.val;
        }

        if(node.left != null){
            countGoodNodes(node.left , maxi);
        }
        if(node.right != null){
            countGoodNodes(node.right,maxi);
        }

    }
}
