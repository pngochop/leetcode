/*
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

 Input: p = [1,2,3], q = [1,2,3]
Output: true

Input: p = [1,2,1], q = [1,1,2]
Output: false
*/

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
        return helper(p,q);
    }
    
    private boolean helper(TreeNode p, TreeNode q) {        
        if (p == null && q == null) return true;
        
        if (p != null && q!= null) {
            return p.val == q.val && helper(p.left,q.left) && helper(p.right,q.right);
        }
        return false;
    }
}