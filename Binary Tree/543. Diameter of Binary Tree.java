// Problem Link: https://leetcode.com/problems/diameter-of-binary-tree/description/

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
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        findDiameter(root);
        return diameter;
    }
    private int findDiameter(TreeNode node){
        if(node==null) return 0;

        int left=findDiameter(node.left);
        int right=findDiameter(node.right);

        diameter=Math.max(diameter, left + right);
        return 1+Math.max(left,right);
    }
}



//  [Second Approach]
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {

        if(root ==null){return 0;}
        int leftdia=diameterOfBinaryTree(root.left);
        int rightdia=diameterOfBinaryTree(root.right);

         int d1=height(root.left);
         int d2=height(root.right);

         int d=d1+d2+2;
         return Math.max(d,Math.max(leftdia,rightdia));
    }
    private static int height(TreeNode node){
        if(node==null){return -1;}
        int lt=height(node.left);
        int rt=height(node.right);

        return Math.max(lt,rt)+1;
    }
}
