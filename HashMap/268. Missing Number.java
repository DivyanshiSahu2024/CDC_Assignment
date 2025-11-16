//Problem Link: https://leetcode.com/problems/missing-number/

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
