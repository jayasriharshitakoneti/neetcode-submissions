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
    int result = 0;

    void dfs(TreeNode curr, int parent) {
        if (curr == null) {
            return;
        }

        if (curr.val >= parent) {
            result++;
            parent=curr.val;
        }

        dfs(curr.left, parent);
        dfs(curr.right, parent);
    }

    public int goodNodes(TreeNode root) {

        int parent = Integer.MIN_VALUE;
        dfs(root, parent);

        return result;

    }
}