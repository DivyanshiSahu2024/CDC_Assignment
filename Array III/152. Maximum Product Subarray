// Problem Link: https://leetcode.com/problems/maximum-product-subarray/description/

class Solution {
    public int maxProduct(int[] nums) {
        int maxproduct=nums[0];
        int pre=1, suff=1, n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(pre==0){
                pre=1;
            }
            if(suff==0){
                suff=1;
            }
            pre=pre*nums[i];
            suff=suff*nums[n-i-1];
            maxproduct=Math.max(maxproduct, Math.max(pre,suff));

        }
        return maxproduct;
    }
}


//////////////////////////////////////////////////////////////////////////////////////////////////////
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];
        
        for (int i = 1; i < n; i++) {
            int temp = maxEndingHere;
            
            // Update max/min ending here
            maxEndingHere = Math.max(nums[i], Math.max(nums[i] * maxEndingHere, nums[i] * minEndingHere));
            minEndingHere = Math.min(nums[i], Math.min(nums[i] * temp, nums[i] * minEndingHere));
            
            // Update global max
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        return maxSoFar;
    }
}

