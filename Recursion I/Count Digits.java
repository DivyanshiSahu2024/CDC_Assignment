//Problem Link: https://www.geeksforgeeks.org/problems/count-digits5716/0

//Solution in Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int c=0;
        while(n>0){
            int d=n%10;
            if(d==0){ continue;}
            else if(n%d==0) {c++;}
            n/=10;
        }
        return c;
    }
}


// this code gave RUNTIME ERROR... IT NEEDS TO BE OPTIMISED.
// Optimised CODE Below
class Solution {
    static int evenlyDivides(int n) {
        // code here
       int count = 0;
        int original = n;  // Store original value
        
        while (n > 0) {
            int digit = n % 10;
            // Check if digit is non-zero and divides original number
            if (digit != 0 && original % digit == 0) {
                count++;
            }
            n /= 10;
        }
        
        return count;
    }
}
