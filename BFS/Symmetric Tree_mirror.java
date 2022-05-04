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
 
 Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 Input: root = [1,2,2,3,4,4,3]
Output: true
Input: root = [1,2,2,null,3,null,3]
Output: false
 */
 
// recursively and iteratively
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;        
        return helper (root.left,root.right);
    }
    
    private boolean helper(TreeNode rootL, TreeNode rootR) {
        if (rootL == null && rootR == null) return true;
        if (rootL != null && rootR !=null)
            return rootL.val == rootR.val && helper(rootL.left,rootR.right) && helper(rootL.right,rootR.left);
        return false;
    }
    
}
/*
public boolean isSymmetric(TreeNode root) {
    if(root == null) return true;
    Stack<TreeNode> stack = new Stack<TreeNode>();
    stack.push(root.left);
    stack.push(root.right);
    while(!stack.empty()) {
        TreeNode right = stack.pop();
        TreeNode left = stack.pop();
        if (left == null && right == null) continue;
        else if (left == null || right == null || right.val != left.val) return false;
        stack.push(left.left);
        stack.push(right.right);
        stack.push(left.right);
        stack.push(right.left);
    }
    return true;
}
*/
