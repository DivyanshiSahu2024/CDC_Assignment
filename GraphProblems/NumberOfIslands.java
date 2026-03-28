
import java.util.*;

public class NumberOfIslands {
    public static void dfs(char [][] grid,int vis[][],int row,int col){
        int m=grid.length;
        int n=grid[0].length;

        if(row<0 || row>=m || col<0 || col>=n || vis[row][col]==1 || grid[row][col]=='0'){
            return;
        }
       vis[row][col]=1;
       dfs(grid,vis,row-1,col);
       dfs(grid,vis,row,col+1);
       dfs(grid,vis,row+1,col);
       dfs(grid,vis,row,col-1);

    }
    public static int numIslands(char [][] grid){
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        int vis[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    count++;
                    dfs(grid,vis,i,j);
                }
            }
        }
        return count;
    }
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    char grid[][]=new char[m][n];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            grid[i][j]=sc.next().charAt(0);
        }
    }
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
           System.out.print(grid[i][j]+' ');
        }
        System.out.println();
    }
    
    int count=numIslands(grid);
    System.out.println(count);
    sc.close();
}
}