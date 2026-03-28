//Problem Link: https://leetcode.com/problems/sliding-window-maximum/description/

//BRUTE FORCE BUT TIME LIMIT EXCEEDED 
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) { 
        ArrayList<Integer> ans=new ArrayList<>(); 
        for(int i=0;i<=nums.length-k;i++){
         ArrayList<Integer> sw=new ArrayList<>();
          for (int j = i; j < i + k; j++) {
                sw.add(nums[j]);
            }   
         int max=Collections.max(sw);
         ans.add(max);
        }
        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i); 
        }
        return arr;
    }  
}



// OPTIMIZED --- Submitted.
/*
Time: 
𝑂(𝑛log𝑘)
Each insertion/removal in the heap costs log𝑘.
Space: 𝑂(𝑘)for the heap.
*/
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) { 
       if(nums.length==0 || k==0 ) return new int[0];

       int n=nums.length;
       int[] result=new int[n-k+1];

       //Max heap: store pairs[value, index]
       PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->b[0]-a[0]);
       //Build the initial window
       for(int i=0;i<k;i++){
        pq.offer(new int[]{nums[i],i});
       }

       result[0]=pq.peek()[0];
       //
       for (int i = k; i < n; i++) {
            pq.offer(new int[]{nums[i], i});
            
            // Remove elements outside the window
            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }
            
            result[i - k + 1] = pq.peek()[0];
        }
        
        return result;



    }  
}
