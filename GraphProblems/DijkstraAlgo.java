import java.util.*;

public class DijkstraAlgo {
    public static class Pair{
        int v;
        int wt;
        public Pair(int v, int wt){
            this.v=v;
            this.wt=wt;
        }
    }
    
    public static int[] dijkstraAlgo(List<List<Pair>> adj,int n, int src){
         PriorityQueue<Pair> q=new PriorityQueue<>(n,Comparator.comparingInt(o->o.wt));
         int dis[]=new int[n];
         Arrays.fill(dis,Integer.MAX_VALUE);

         dis[src]=0;
         q.add(new Pair(src,0));

         while(!q.isEmpty()){
            Pair qp=q.remove();

            int node=qp.v;
            int dist=qp.wt;

            for(Pair p:adj.get(node)){
                if(dis[p.v]>dist+p.wt){
                    dis[p.v]=dist+p.wt;
                    q.add(new Pair(p.v,dis[p.v]));
                }
            }
         }
         return dis;

    }
   
    public static void main(String[] args) {
        // Dijkstra's algorithm implementation goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); // number of vertices
        int e=sc.nextInt(); // number of edges
        int src=sc.nextInt();//source node

        List<List<Pair>> adj=new ArrayList<>();

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<e;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            int w=sc.nextInt();

            adj.get(u).add(new Pair(v,w));
            adj.get(v).add(new Pair(u,w));
        }
        //display the adjacency List
	    
	    for(int i=0;i<n;i++){
	        System.out.print(i+" -> { ");
	        for(int j=0;j<adj.get(i).size();j++){
	        System.out.print("("+ adj.get(i).get(j).v+", "+adj.get(i).get(j).wt+" )");
	        }
	        System.out.println(" }");
	    }

        //dijkstraAlgorithm
        int distance[]=dijkstraAlgo(adj,n,src);
      
        for(int i=0;i<n;i++){
            System.out.println(distance[i]+" ");
        }
        sc.close();
    }
}