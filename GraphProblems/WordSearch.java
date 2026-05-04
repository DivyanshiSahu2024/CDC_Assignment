import java.util.*;
import java.io.*;

public class Main
{
    private static boolean dfs(int row,int col, boolean[][] vis, int index, char grid[][],String word){
        if(index==word.length()){
            return true;
        }
        if( row<0||row>=grid.length||col<0||col>=grid[0].length||vis[row][col]||grid[row][col]!=word.charAt(index)){
            return false;
        }
        vis[row][col]=true;
        boolean found=dfs(row+1,col,vis,index+1,grid,word)||
                      dfs(row-1,col,vis,index+1,grid,word)||
                      dfs(row,col+1,vis,index+1,grid,word)||
                      dfs(row,col-1,vis,index+1,grid,word);
        vis[row][col]=false;//backtrack
        return found;
        
    }
    public static boolean exist(char[][] grid, String word){
        int m=grid.length;
        int n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dfs(i,j,vis,0,grid,word)){
                    return true;
                }
            }
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
	    char grid[][]=new char[m][n];
	    for(int i=0;i<m;i++){
	        for(int j=0;j<n;j++){
	            grid[i][j]=sc.next().charAt(0);
	        }
	    }
	    String word=sc.next();
	    System.out.println(exist(grid, word));
	}
}
