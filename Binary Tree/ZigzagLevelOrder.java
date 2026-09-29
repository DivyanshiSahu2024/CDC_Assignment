import java.util.*;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class ZigZagTraversal {
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            // Using LinkedList for O(1) insertion at both ends
            List<Integer> levelList = new LinkedList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();

                if (leftToRight) {
                    levelList.addLast(node.val);
                } else {
                    levelList.addFirst(node.val);
                }

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            result.add(levelList);
            leftToRight = !leftToRight; // Toggle direction for next level
        }

        return result;
    }

    public static void main(String[] args) {
        ZigZagTraversal solution = new ZigZagTraversal();
        
        // Constructing a sample tree:
        //         1
        //       /   \
        //      2     3
        //     / \   / \
        //    4   5 6   7
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = solution.zigzagLevelOrder(root);

        // Print each level in a new line
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}   
