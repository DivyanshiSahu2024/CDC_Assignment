///  Problem Link: https://leetcode.com/problems/maximum-subarray/description/

class Solution {
    public int maxSubArray(int[] nums) {
         int maxSum=nums[0];
         int currentSum=nums[0];
         for(int i=1;i<nums.length;i++){
            currentSum=Math.max(nums[i],currentSum+nums[i]);
            maxSum=Math.max(maxSum,currentSum);
         }
         
         return maxSum;
    } 
}


////////////
class Solution {
    public int maxSubArray(int[] nums) {
         int currSum =nums[0], maxSum =nums[0];
         int n=nums.length;
      for(int i=1;i<n;i++) {
        if (currSum >= 0) {
          currSum +=nums[i];
        } else {
          currSum =nums[i];
        }
        
        if (currSum > maxSum) {
          maxSum = currSum;
        }
      }
      
      return maxSum;
    } 
}
