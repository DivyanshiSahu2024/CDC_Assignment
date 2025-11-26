// Problem Link: https://leetcode.com/problems/sum-of-left-leaves/
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){return 0;}
        while(root.left != null && root.left.left == null && root.left.right ==null){
            return root.left.val + sumOfLeftLeaves(root.right);
        }
        int leftsidesum=sumOfLeftLeaves(root.left);
        int rightsidesum=sumOfLeftLeaves(root.right);

        return leftsidesum+rightsidesum;
    }
}
