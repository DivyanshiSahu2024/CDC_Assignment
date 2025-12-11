// Problem Link: https://leetcode.com/problems/search-a-2d-matrix/description/
// Leetcode 74

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int found=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    found++;
                }
            }
        }
        return (found==0) ? false : true;
    }
}
