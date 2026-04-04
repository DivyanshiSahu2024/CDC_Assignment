
import java.util.*;
public class Main
{
    public static void search(List<String> Queries,String word ){
      Collections.sort(Queries);
      char ch=word.charAt(0);
      boolean found=false;
      for(String q:Queries){
          char firstletter=q.charAt(0);
          if(ch==firstletter){
              System.out.print(q+" ");
              found=true;
          }
      }
      if (!found) {
            System.out.println("no suggestions");  
        } else {
            System.out.println();
        }
    }
    
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<String> Queries=new ArrayList<>();
		while(n-->0){
		    String operation=sc.next();
		    String word=sc.next();
		    
		    if(operation.equals("ADD")){
		        Queries.add(word);
		    }
		    if(operation.equals("SEARCH")){
		        search(Queries,word);
		    }
		}
	}
}
