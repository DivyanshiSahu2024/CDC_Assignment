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



//self practice simple approach 
import java.io.*;
import java.util.*;
public class Main

{   public static class Node{
     int data;
     Node left;
     Node right;
     
    Node(int data){
        this.data=data;
    }
    
}
    
    public static void levelOT(Node node){
    Queue<Node> q=new LinkedList<>();
    q.add(node);
    int sz=q.size();
    while(q.size()>0){
        Node n=q.remove();
        System.out.println(n.data+" ");
        
        
        if(n.left!=null){
            q.add(n.left);
        }
        
        if(n.right !=null){
            q.add(n.right);
        }
        sz--;
    }
    System.out.println();
}
	public static void main(String[] args) {
	    Node a=new Node(10);
	    Node b=new Node(20);
	    Node c=new Node(30);
	    Node d=new Node(40);
	    Node e=new Node(50);
	    
	    a.left=b;
	    a.right=c;
	    
	    b.left=d;
	    c.right=e;
	    
	    levelOT(a);
	    
	}
}
