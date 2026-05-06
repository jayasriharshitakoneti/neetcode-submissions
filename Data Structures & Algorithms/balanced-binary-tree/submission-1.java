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
    boolean isTrueOrFalse=true;

    public int height(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        if(isTrueOrFalse){
            if(Math.abs(leftHeight-rightHeight)>1){
                isTrueOrFalse=false;
            }
        }
        return Math.max(leftHeight,rightHeight)+1;
    }


    public boolean isBalanced(TreeNode root) {
        height(root);
        return isTrueOrFalse;
    }

}