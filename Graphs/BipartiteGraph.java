package GraphProblems;
import java.util.*;

public class BipartiteBFS {
    
    public static boolean bfs(List<List<Integer>> adjlist, int [] color, int node){
        color[node]=0;
        Queue<Integer> q=new LinkedList<>();
        q.add(node);

        while(!q.isEmpty()){
            node=q.remove();

            for(int nbr:adjlist.get(node)){
                if(color[nbr]==-1){
                    color[nbr] = 1-color[node];
                    q.add(nbr);
                }
                else if(color[nbr] == color[node]) {
                return false;
            }
          }
        }

        return true;
    }
    public static boolean IsBipartite(List<List<Integer>> adjlist, int n){
        int color[]=new int [n+1];
        Arrays.fill(color,-1);
        for(int i=0;i<=n;i++){
            if(color[i]==-1){
               if( bfs(adjlist,color,i)==false){
                return false;
               }
            }
        }
        return true;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//number of nodes
        int e=sc.nextInt();//number if edges

        List<List<Integer>> adjlist=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adjlist.add(new ArrayList<>());
        }

        for(int i=0;i<e;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();

            adjlist.get(u).add(v);
            adjlist.get(v).add(u);
        }

        boolean bipartite=IsBipartite(adjlist,n);
        System.out.println("Is Graph Bipartite? : "+bipartite);
        sc.close();
    }
}
