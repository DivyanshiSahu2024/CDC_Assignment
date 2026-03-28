import java.util.*;
class DetectCycleDG{
public static boolean dfs(List<List<Integer>> adjlist, int vis[], int pathvis[], int node){
    vis[node]=1;
    pathvis[node]=1;

    for(int nbr:adjlist.get(node)){
        if(vis[nbr]==0){
            if(dfs(adjlist, vis, pathvis, nbr)==true) {
                return true;
            }
        }
        else if (pathvis[nbr] == 1) {
          return true;
        }
    }
    pathvis[node]=0;
    return false;
}
public static boolean IsCycle(List<List<Integer>> adjlist, int n) {
    int vis[]=new int [n+1];
    int pathvis[]=new int[n+1];
    for(int i=1;i<=n;i++){
        if(vis[i]==0){
            if(dfs(adjlist,vis,pathvis,i)==true) return true;
        }
    }
    return false;
}
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(); 
    int e=sc.nextInt();

    List<List<Integer>> adjlist=new ArrayList<>();
    for(int i=0;i<=n;i++){
        adjlist.add(new ArrayList<>());
    }   

    for(int i=0;i<e;i++){
        int u=sc.nextInt();
        int v=sc.nextInt();

        adjlist.get(u).add(v);
    }
    
    System.out.println("Is there a cycle in the directed graph? : "+IsCycle(adjlist,n));
    sc.close();

 }
}