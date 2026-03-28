import java.util.*;

class KahnsAlgo{
    public static int[] topoSort(List<List<Integer>> adj, int n){
        int indegree[]=new int[n];
        for(int i=0;i<n;i++){
            for(int nbr:adj.get(i)){
                indegree[nbr]++;
            }
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }

        int topo[]=new int[n];
        int i=0;
        while(!q.isEmpty()){
            int node=q.peek();
            q.remove();
            topo[i++]=node;

            for(int nbr:adj.get(node)){
                indegree[nbr]--;
                if(indegree[nbr]==0){
                    q.add(nbr);
                }
            }
        }
        return topo;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();
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
        for(int i:ans){
            System.out.print(i+" ");
        }

    }
}