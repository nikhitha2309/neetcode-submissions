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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        return getSubTreeRoot(root,subRoot);

    }

    public boolean getSubTreeRoot(TreeNode node,TreeNode subRoot){
        if(node.val == subRoot.val){
            boolean res = checkTree(node ,subRoot );
            if(res){
                return res;
            }

        }
        if (node.left != null) {
            if (getSubTreeRoot(node.left, subRoot)) {
                return true;
            }
        }

        if (node.right != null) {
            if (getSubTreeRoot(node.right, subRoot)) {
                return true;
            }
        }

        return false;
    }

    public boolean checkTree(TreeNode node , TreeNode subRootNode){
        if(node.val != subRootNode.val){
            return false;
        }
        if((node.left == null && subRootNode.left != null) ||
         (node.left != null && subRootNode.left == null)){
            return false;
         }
        
        boolean leftTree = true;
         if(node.left != null && subRootNode.left != null){
            leftTree = checkTree(node.left,subRootNode.left);
         }

         boolean rightTree = true;

         if((node.right == null && subRootNode.right != null) ||
         (node.right != null && subRootNode.right == null)){
            return false;
         }

         if(node.right != null && subRootNode.right != null){
            rightTree = checkTree(node.right,subRootNode.right);
         }

         if(node.left == null && node.right == null && subRootNode.left == null
         && subRootNode.right == null){
            return true;
         }

         return leftTree && rightTree;
    }
}
