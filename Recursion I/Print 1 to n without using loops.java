// Problem Link: 
// https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops3621/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
class Solution {
    static void printTillN(int N) {
        // code here
       printHelper(1,N);
     }
    static void printHelper(int i,int N){
        if(i>N) return;
        System.out.print(i+" ");
        printHelper(i+1,N);
    }
}
