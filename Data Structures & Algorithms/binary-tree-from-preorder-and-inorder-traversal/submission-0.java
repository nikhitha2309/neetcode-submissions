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
    int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return construct(preorder,inorder,0,preorder.length-1);

        
    }

    public TreeNode construct(int[] preorder , int[] inorder , int start,int end){

        if(start > end){
            return null;
        }

        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);
        int index = start;
        while (index <= end && inorder[index] != rootVal) {
            index++;
        }
        root.left = construct(preorder,inorder,start,index-1);
        root.right = construct(preorder,inorder,index+1,end);
        return root;


    } 
}
