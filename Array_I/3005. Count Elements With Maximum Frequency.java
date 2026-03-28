/*
Example 1:

Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.



*/

class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        int maxFreq=0;
        for(int i=0;i<nums.length;i++){
            int count = freq.getOrDefault(nums[i],0)+1;
            freq.put(nums[i],count);
            maxFreq = Math.max(maxFreq, count);
        }
        int total=0;
        for(int count:freq.values()){
            if(count==maxFreq){
                total+=count;
            }
        }
        return total;
    }
}
