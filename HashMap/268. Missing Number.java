//Problem Link: https://leetcode.com/problems/missing-number/
// simple approach----runtime 5ms
class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
           map.put(nums[i],true);
        }
        for(int i=0;i<=nums.length;i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        return -1;
    }
}

//optimized approach-----runtime 0ms
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int totalsum = 0;
        for (int i = 1; i <= n; i++) {
            totalsum += i;
        }
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        return totalsum - sum;
    }
}
