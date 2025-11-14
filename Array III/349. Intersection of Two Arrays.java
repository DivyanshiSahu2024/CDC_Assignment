// Problem Link:https://leetcode.com/problems/intersection-of-two-arrays/submissions/1739183714/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> result=new HashSet<>();

        // Add all elements of num1 to set1
        for(int num:nums1){
            set1.add(num);
        }

        //check if elements of nums 2 are in set1
        for(int num:nums2){
            if(set1.contains(num)){
                result.add(num);
            }
        }
        //convert result to an array
        int output[]=new int [result.size()];
        int i=0;
        for(int num:result){
            output[i++]=num;
        }        
        return output;
    }
}
