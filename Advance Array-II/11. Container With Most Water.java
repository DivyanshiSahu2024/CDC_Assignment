//    Problem Link: https://leetcode.com/problems/container-with-most-water/description/

//****TWO POINTERS APPROACH *********// RUNTIME=4MS
class Solution {
    public int maxArea(int[] height) {
     int maxarea=0;
     int p1=0, p2=height.length-1;
     while(p1<p2){
        int area=(p2-p1)*(Math.min(height[p1],height[p2]));
        if(area > maxarea){
            maxarea=area;
        }
        if(height[p1]<height[p2]){
            p1++;
        }
        else{
            p2--;
        }
     }
     return maxarea;
    }
}





