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
    List<Integer> tree=new ArrayList<>();

    void in(TreeNode root){
        if(root==null){
            return;
        }
        in(root.left);
        tree.add(root.val);
        in(root.right);
    }

    public boolean isValidBST(TreeNode root) {

        in(root);

        for(int i=1;i<tree.size();i++){
            if(tree.get(i)<=tree.get(i-1)){
                return false;
            }
        }

        return true;
    }
}