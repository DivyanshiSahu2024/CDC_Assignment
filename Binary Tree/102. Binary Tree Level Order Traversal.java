// Problem Link: https://leetcode.com/problems/binary-tree-level-order-traversal/description/

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
        ArrayList<List<Integer>> result = new ArrayList<>();
        levelOrderInternal(root, 0, result);
        return result;
    }

    public void levelOrderInternal(TreeNode current, int level, ArrayList<List<Integer>> data){
        if(current == null){
            return;
        }

        if(level < data.size()){
            data.get(level).add(current.val);
        }
        else{
            LinkedList<Integer> currentLevel = new LinkedList<>();
            currentLevel.add(current.val);
            data.add(currentLevel);
        }

        levelOrderInternal(current.left, level+1, data);
        levelOrderInternal(current.right, level+1, data);
    }
}
