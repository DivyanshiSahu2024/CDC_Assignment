import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        //int e = edges.length;

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int vis[] = new int[n];
        return helper(adj, source, destination, vis);
    }

    public static boolean helper(List<List<Integer>> adj, int src, int dest, int vis[]) {
        vis[src] = 1;
        if (src == dest) {
            return true;
        }
        for (int nbr : adj.get(src)) {
            if (vis[nbr] == 0) {
                if (helper(adj, nbr, dest, vis)) {
                    return true;
                }
            }
        }
        return false;
    }
}