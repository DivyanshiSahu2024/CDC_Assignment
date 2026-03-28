
import java.util.*;

public class NumberOfProvinces {
    public static void bfs(int[][] isConnected,boolean[] vis,int i,int n){
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        vis[i]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            for(int j=1;j<=n;j++){
                if(isConnected[node-1][j-1]==1 && !vis[j]){
                    q.add(j);
                    vis[j]=true;
                }
            }
        }
    }
    public static int numberofProvinces(int[][] isConnected, int n) {
        int count=0;
        boolean[] vis=new boolean[n+1];
        for(int i=1;i<=n;i++){
            if(!vis[i]){
                count++;
                bfs(isConnected,vis,i,n);
            }
        }
        return count;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int [][] isConnected=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                isConnected[i][j]=sc.nextInt();
            }
        }

        int ans=numberofProvinces(isConnected,n);
        System.out.println(ans);
        sc.close();
    }
}
