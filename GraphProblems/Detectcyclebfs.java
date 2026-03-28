/******************************************************************************

                            Detect Cycle in Graph using BFS

*******************************************************************************/

import java.util.*;

public class Detectcyclebfs
{
    static class Pair {
		int node;
		int parent;

		public Pair(int node,int parent) {
			this.node=node;
			this.parent=parent;
		}
	}
	public static boolean bfs(List<List<Integer>> adj, int [] vis, int node) {
        vis[node]=1;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(node,-1));
        
        
        while(!q.isEmpty()){
            Pair p=q.remove();
            for(int nbr:adj.get(p.node)){
                if(vis[nbr]==0){
                    vis[nbr]=1;
                    q.add(new Pair(nbr, p.node));
                }
                else if(p.parent != nbr){
                    return true;
                }
            }
        }
        return false;
	}
	public static boolean hasCycle(List<List<Integer>> adj,int n) {
		int [] vis=new int[n+1];
		for(int i=0; i<=n; i++) {
			if(vis[i]==0) {
				if(bfs(adj,vis,i)==true) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int e=sc.nextInt();

		List<List<Integer>> adj=new ArrayList<>();
		for(int i=0; i<=n; i++) {
			adj.add(new ArrayList<>());
		}

		for(int i=0; i<e; i++) {
			int u=sc.nextInt();
			int v=sc.nextInt();

			adj.get(u).add(v);
			adj.get(v).add(u);
		}

		System.out.println(hasCycle(adj,n));
    sc.close();

	}
}