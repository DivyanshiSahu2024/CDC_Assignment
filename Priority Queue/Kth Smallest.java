//Problem Link: 

//Simplest Approach
class Solution {
    public int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }
}

//Priority Queue Approach
import java.util.*;
class Solution {
    public int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int val:arr){
            pq.add(val);
        }
        for(int i=0;i<k-1;i++){
            pq.poll();
        }
        int ans=pq.peek();
        return ans;
    }
}
