
import java.util.*;
class Node{
        int data;
        Node left, right;
        public Node(int data){
         this.data=data;
        }
    }

public class Main
{
    Node root;
    public void insert(int data){
        Node newNode=new Node(data);
        if(root==null) {
            root=newNode;
            return;
        }
        
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            Node curr=q.poll();
            
            if(curr.left==null){
                curr.left=newNode;
                return;
            }
            else{
                q.add(curr.left);
            }
            
            if(curr.right==null){
                curr.right=newNode;
                return;
            }
            else{
                q.add(curr.right);
            }
            
            
        }
    }
    
    public static void iot(Node node){
     if(node==null){
         return;
     }
     iot(node.left);
     System.out.print(node.data+" ");
     iot(node.right);
        
    }
    
    
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of nodes in tree: ");
		int n=sc.nextInt();
		Main tree=new Main();
		System.out.println("Enter "+ n+ "values: ");
		for(int i=0;i<n;i++){
		    tree.insert(sc.nextInt());
		}
		iot(tree.root);
		
		
	}
}
