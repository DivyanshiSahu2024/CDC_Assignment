// Problem Link: https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
class Solution {
    public int reverseExponentiation(int n) {
        // code here
        if(n<10)
        return (int)Math.pow(n,n); // for single digit no need to reverse 
        int rev=0;
        int b=n;
        while(n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        return (int)Math.pow(b,rev); 
    }
}
