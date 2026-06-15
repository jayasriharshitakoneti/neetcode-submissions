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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> level1 = new LinkedList<>();
        Queue<TreeNode> level2 = new LinkedList<>();
        level1.add(root);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> eachLevel = new ArrayList<>();

        while (!level1.isEmpty()) {
            while (!level1.isEmpty()) {
                TreeNode curr = level1.poll();
                if (curr != null) {
                    eachLevel.add(curr.val);
                    if (curr.left != null) {
                        level2.add(curr.left);
                    }
                    if (curr.right != null) {
                        level2.add(curr.right);
                    }
                }
            }
            result.add(eachLevel);
            eachLevel = new ArrayList<>();
            level1 = level2;
            level2 = new LinkedList<>();
        }
        return result;
    }
}