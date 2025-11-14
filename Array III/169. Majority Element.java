// ProblemLink: https://leetcode.com/problems/majority-element/
 class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer, Integer> count=new HashMap<>();
        for (int c:nums){
            count.put(c,count.getOrDefault(c,0)+1);
            if (count.get(c)  > n/2) {
                return c; // More occurrences in t than in s
            }
         }
        return -1;
        }
}
///////
class Solution {
    public int majorityElement(int[] nums) {
      HashMap<Integer,Integer> freq=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        if(freq.get(nums[i])>nums.length/2){
            return nums[i];
        }
      }
      return -1;
    }
}
