import java.util.*;

class Trippal{
        int row;
        int col;
        int time;
        Trippal(int row,int col,int time){
            this.row=row;
            this.col=col;
            this.time=time;
        }
    }
public class RottenOranges {
    
    public static int orangesRotting(int[][] grid){
        // We will use BFS to solve this problem as it is level order traversal and we need to find minimum time to rot all the oranges.
        int n=grid.length;
        int m=grid[0].length;

        Queue<Trippal> q=new LinkedList<>();
        int vis[][]=new int[n][m];
        int cntfresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Trippal(i,j,0));
                    vis[i][j]=2;
                }
                else{
                    vis[i][j]=0;
                }
                if(grid[i][j]==1){
                    cntfresh++;
                }
            }
        }

        int time=0;
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
        int cnt=0;
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().time;
            time=Math.max(time,t);
            q.remove();
            for(int i=0;i<4;i++){
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    q.add(new Trippal(nrow, ncol, t+1));
                    vis[nrow][ncol]=2;
                    cnt++;
                }
            }
        }

        if(cnt!=cntfresh){
            return -1;
        }
        return time;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int ans = orangesRotting(grid);
        System.out.println(ans);
        sc.close();
    }
}
