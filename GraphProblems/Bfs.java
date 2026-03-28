
import java.util.*;

public class Bfs {
    public static void BFSTraversal(ArrayList<ArrayList<Integer>> adjlst,int n){
        int [] vis=new int[n+1];
        vis[1]=1;
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        while(q.size() > 0){
            int node=q.poll();
            System.out.print(node+" ");
            for(int it:adjlst.get(node)){
                if(vis[it]==0){
                    vis[it]=1;
                    q.add(it);
                }
            }
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();

        ArrayList<ArrayList<Integer>> adjlst=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adjlst.add(new ArrayList<>());
        }

        for(int i=0;i<e;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();

            adjlst.get(u).add(v);
            adjlst.get(v).add(u);

        }
        System.out.println("Adjacency List:");
        for(int i=0;i<=n;i++){
            System.out.println(i+"->"+adjlst.get(i));
        }
        System.out.println();
        System.out.println("BFS Traversal:");
        BFSTraversal(adjlst,n);
        sc.close();
    }
}
