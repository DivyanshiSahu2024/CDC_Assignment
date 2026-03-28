
import java.util.*;


public class NumberOfDistinctIsland {
    public static  void dfs(int [][]grid, int vis[][], int row, int col, ArrayList<String > list, int row0, int col0){
        vis[row][col]=1;
        list.add((row - row0) + "," + (col - col0));
        int m=grid.length;
        int n=grid[0].length;
        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};
        for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                dfs(grid,vis,nrow,ncol,list,row0,col0);
            }
        }

    } 
    public static int numOfDistinctIslands(int[][] grid) {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        int vis[][]=new int[m][n];
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==0 && grid[i][j]==1){
                    ArrayList<String> list=new ArrayList<>();
                    dfs(grid,vis,i,j,list,i,j);
                    String str="";   
                    for(String s:list){
                        str+=s;
                    }
                    set.add(str);
                }
            }
        }
        count=set.size();
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        int [][] grid=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=sc.nextInt();
            }
        }

        int num=numOfDistinctIslands(grid);
        System.out.println(num);   
        sc.close();
    }
}
