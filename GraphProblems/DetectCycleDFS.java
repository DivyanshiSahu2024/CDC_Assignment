import java.util.*;
public class DetectCycleDFS {

    public static boolean dfs(List<List<Integer>> adj, int [] vis,int node,int parent){
        vis[node]=1;
        for(int nbr:adj.get(node)){
            if(vis[nbr]==0){
                if(dfs(adj,vis,nbr,node)==true){
                    return true;
                }
            }
            else if(nbr!=parent){
                return true;
            }
        }
        return false;
    }
    public static boolean detectCycle(List<List<Integer>> adj, int n){
        int vis[]=new int [n+1];
        vis[1]=1;
        for(int i=1;i<=n;i++){
            if(vis[i]==0){
                if(dfs(adj,vis,i,-1)==true){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//number of nodes
        int e=sc.nextInt();//number of edges

        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<e;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean st=detectCycle(adj,n); 
        System.out.println(st);       
        sc.close();
    }
}
