// Problem Link: https://leetcode.com/problems/trapping-rain-water/description/


class Solution {
    public int trap(int[] height) {
        int gap=0;
        int left=0, right=height.length-1;
        int leftmax=0,rightmax=0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=leftmax){
                    leftmax=height[left];
                }
                else{
                     gap+=leftmax-height[left];
                }
                left++;
             }
            else{
               if(height[right]>=rightmax){
                rightmax=height[right];
               }
               else{
                gap+=rightmax-height[right];
               }
               right--;
            }
        }
        return gap;
    }
}
