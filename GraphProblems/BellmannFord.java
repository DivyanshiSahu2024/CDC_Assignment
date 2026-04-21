import java.util.*;

public class BellmannFord {
    public static int[] bellmanFord(int n,  ArrayList<ArrayList<Integer>> edges, int src){
        int dist[]=new int[n];
        Arrays.fill(dist, (int)1e8); //or use (int)1e8 for infinity
        dist[src]=0;
        for(int i=0;i<n-1;i++){
            for(ArrayList<Integer> it:edges){
                int u=it.get(0);
                int v=it.get(1);
                int w=it.get(2);
                if(dist[u]!=(int)1e8 && dist[u]+w<dist[v]){
                    dist[v]=dist[u]+w;
                }
            }
        }

        //nth relaxation to check negative weight cycle 
        for(ArrayList<Integer> it:edges){
            int u=it.get(0);
            int v=it.get(1);
            int w=it.get(2);
            if(dist[u]!=(int)1e8 && dist[u]+w<dist[v]){
                int temp[]=new int[1];
                temp[0]=-1;
                return temp;
            }
        }

        return dist;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//no. of Nodes
        int e=sc.nextInt();//no. of edges

        // ArrayList<int[]> edges = new ArrayList<>();
        // for(int i=0;i<e;i++){
        //     int u=sc.nextInt();
        //     int v=sc.nextInt();
        //     int w=sc.nextInt();
        //     edges.add(new int[]{u,v,w});
        // }

        ArrayList<ArrayList<Integer>> edges=new ArrayList<>();
        for(int i=0;i<e;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            int w=sc.nextInt();
            ArrayList<Integer> edge = new ArrayList<>();
            edge.add(u);
            edge.add(v);
            edge.add(w);
            edges.add(edge);
        }

        int src=0; //source node

        int [] ans=bellmanFord(n, edges, src);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        sc.close();
    }
}
