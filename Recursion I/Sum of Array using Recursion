// Problem Link: 
//https://www.geeksforgeeks.org/problems/sum-of-array2326/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

// Basic Solution

class Solution {
    int arraySum(int arr[]) {
        // code here
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}

//  Using Recursion

class Solution {
    int arraySum(int arr[]) {
            return sumHelper(arr, 0);
    }
    // Helper function to perform recursion
    int sumHelper(int arr[], int index) {
        if (index == arr.length)
            return 0;
        return arr[index] + sumHelper(arr, index + 1);
    }
}

