
import java.util.*;

public class Dfs {
    public static void dfs(List<List<Integer>> adjLst,int n){
      int vis[]=new int[n+1];
      for(int i=1;i<n;i++){
        if(vis[i]==0){
            dfs_helper(i,adjLst,vis);
        }
      }
    }

    public static void dfs_helper(int node, List<List<Integer>> adjLst, int[] vis){
        vis[node]=1;
        System.out.print(node+" ");
        for(int nbr: adjLst.get(node)){
            if(vis[nbr]==0){
                dfs_helper(nbr,adjLst,vis);
            }
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt(); 
        List<List<Integer>> adjLst=new ArrayList<>();

        for(int i=0;i<=n;i++){
            adjLst.add(new ArrayList<>());
        }

        for(int i=0;i<e;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();

            adjLst.get(u).add(v);
            adjLst.get(v).add(u);

        }

        // Print the adjacency list
        System.out.println("Adjacency List:");
        for(int i=0;i<=n;i++){
            System.out.println(i+"->"+adjLst.get(i));
        }
        System.out.println();
        System.out.println("DFS Traversal:");
        dfs(adjLst,n);
        sc.close();

    }
}
