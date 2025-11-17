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

//[ Simple Recursion Approach]
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightview=new ArrayList<>();
        helper(rightview,root,0);
        return rightview;
    }
    private static void helper(List<Integer> rv, TreeNode node, int currDepth){
        if(node==null){ return ;}
        if(currDepth==rv.size()){
            rv.add(node.val);
        }
       
        helper(rv,node.right,currDepth+1);
        helper(rv,node.left,currDepth+1);
    }
}
