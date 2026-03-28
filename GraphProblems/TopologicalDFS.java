import java.util.*;

public class TopologicalDFS {
    public static void dfs(int node, int []vis, List<List<Integer>> adj, Stack<Integer> st){
        vis[node]=1;
        for(int nbr:adj.get(node)){
            if(vis[nbr]==0){
                dfs(nbr, vis, adj, st);
            }
        }
        st.push(node);
    }
    public static int[] topoSort(List<List<Integer>> adj, int n){
        int vis[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                dfs(i,vis,adj,st);
            }
        }
        int ans[]=new int[n];
        int i=0;
        while(!st.isEmpty()){
           ans[i++]=st.pop();
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//nodes
        int e=sc.nextInt();//edges

        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<e;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            adj.get(u).add(v);
        }

        int ans[]=topoSort(adj,n);
        System.out.println("Topological Sort:");
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        sc.close();
    }
}
