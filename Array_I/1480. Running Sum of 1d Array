/* 
Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
*/

class Solution {
    public int[] runningSum(int[] nums) {
        int sum[]=new int[nums.length];
        int digit=0;
        for(int i=0;i<nums.length;i++){
            digit+=nums[i];
            sum[i]=digit;
        }
        return sum;
    }
}
