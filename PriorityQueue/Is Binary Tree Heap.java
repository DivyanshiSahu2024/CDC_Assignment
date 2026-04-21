//Problem Link: https://www.geeksforgeeks.org/java/priority-queue-in-java/

/*
class Node {
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    public boolean isHeap(Node tree) {
       if (tree == null) return true;
      Queue<Node> q=new LinkedList<>();
      q.add(tree);
      boolean nullSeen=false;
       while (!q.isEmpty()) {
            Node curr = q.poll();

            // Left child check
            if (curr.left != null) {
                if (nullSeen || curr.data < curr.left.data) return false;
                q.add(curr.left);
            } else {
                nullSeen = true;
            }

            // Right child check
            if (curr.right != null) {
                if (nullSeen || curr.data < curr.right.data) return false;
                q.add(curr.right);
            } else {
                nullSeen = true;
            }
        }
        return true;
    }
}
