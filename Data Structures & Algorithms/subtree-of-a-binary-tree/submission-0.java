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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        if (p == null && q == null) {
            return true;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        Queue<TreeNode> bfsTempQueue = new LinkedList<>();
        Queue<TreeNode> nodesInParent = new LinkedList<>();

        //  curr = root;
        bfsTempQueue.add(root);
        nodesInParent.add(root);
        int bfsSize = 1;

        while (bfsTempQueue.size() != 0) {
            int count = 0;

            while (count < bfsSize) {
                TreeNode curr = bfsTempQueue.poll();
                count++;
                if (curr.left != null) {
                    nodesInParent.add(curr.left);
                    bfsTempQueue.add(curr.left);
                }
                if (curr.right != null) {
                    nodesInParent.add(curr.right);
                    bfsTempQueue.add(curr.right);
                }
            }

            bfsSize = bfsTempQueue.size();

        }

        while(nodesInParent.size()!=0){
            TreeNode curr = nodesInParent.poll();
            if(curr.val==subRoot.val){
                if(isSameTree(curr,subRoot)){
                    return true;
                }
            }
        }
        return false;
    }
}