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
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        InorderTraversal(root,list);
        System.out.println(list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }
        return true;
        
    }

    public static void InorderTraversal(TreeNode node ,List<Integer> list){

        if(node.right == null && node.left == null){
            list.add(node.val);
        }else if(node.right != null && node.left != null){
            InorderTraversal(node.left , list);
            list.add(node.val);
            InorderTraversal(node.right,list);
        }else if(node.left != null){
            InorderTraversal(node.left , list);
            list.add(node.val);

        }else if(node.right != null){
            list.add(node.val);
            InorderTraversal(node.right , list);
            
        }

    }
}
