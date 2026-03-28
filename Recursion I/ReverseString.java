
import java.util.*;
public class ReverseString {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ans=reverse(str);    
        System.out.println(ans);
        sc.close();
    }
    public static String reverse(String str){
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
