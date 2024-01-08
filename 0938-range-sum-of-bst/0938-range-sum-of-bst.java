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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null)
            return 0;
        int s = 0;
        if(root.val >= low && root.val <= high){
            System.out.print(root.val+" ");
            s += root.val;
        }
        s += rangeSumBST(root.left,low,high);
        s += rangeSumBST(root.right,low,high);
        return s;
    }
}