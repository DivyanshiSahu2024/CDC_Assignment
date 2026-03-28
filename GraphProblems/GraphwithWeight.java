import java.util.*;

public class GraphwithWeight
{
    public static class Pair{
        int nbr;
        int wt;
        public Pair(int nbr,int wt){
            this.nbr=nbr;
            this.wt=wt;
        }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//nodes
		int e=sc.nextInt();//edges
	
	    List<List<Pair>> adj=new ArrayList<>();
	    
	    for(int i=0;i<=n;i++){
	        adj.add(new ArrayList<>());
	    }
	    
	    for(int i=0;i<e;i++){
	        int u=sc.nextInt();
	        int v=sc.nextInt();
	        int wt=sc.nextInt();
	        adj.get(u).add(new Pair(v,wt));
	        adj.get(v).add(new Pair(u,wt));
	    }
	    
	    //display the adjacency List
	    
	    for(int i=0;i<n;i++){
	        System.out.print(i+" -> { ");
	        for(int j=0;j<adj.get(i).size();j++){
	        System.out.print("("+ adj.get(i).get(j).nbr+", "+adj.get(i).get(j).wt+" )");
	        }
	        System.out.println(" }");
	    }
        sc.close();
	}
    
}