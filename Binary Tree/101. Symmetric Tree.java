// Problem Link: https://leetcode.com/problems/symmetric-tree/description/

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
    public boolean isSymmetric(TreeNode root){
        return isMirror(root.left,root.right);
    }
    private static boolean isMirror(TreeNode node1, TreeNode node2){
        if(node1==null && node2==null){
            return true;
        }

        if(node1==null|| node2==null){
        return false;
        }

        return node1.val==node2.val && isMirror(node1.left,node2.right) && isMirror(node1.right,node2.left);
    }
}





//     [ SECOND APPROACH ]
class Solution {
    public boolean isSymmetric(TreeNode root) {
        invertTree(root.right);
        return isSameTree(root.left,root.right);

    }
    private static TreeNode invertTree(TreeNode node){
        if(node==null){
            return null ;
        }
        TreeNode temp=node.left;
        node.left=node.right;
        node.right=temp;

        node.left=invertTree(node.left);
        node.right=invertTree(node.right);

        return node;
    }

    private static boolean isSameTree(TreeNode n1, TreeNode n2 ){
        if(n1==null && n2==null){
            return true;
        }
        if(n1== null || n2==null){
            return false;
        }

        boolean cond1=(n1.val==n2.val);
        boolean cond2=isSameTree(n1.left,n2.left);
        boolean cond3=isSameTree(n1.right,n2.right);
 
         return cond1 && cond2 && cond3;
    }
}
