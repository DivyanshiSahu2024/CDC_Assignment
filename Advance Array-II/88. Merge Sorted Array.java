// Problem Link: https://leetcode.com/problems/merge-sorted-array/description/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i = m - 1;       // pointer for nums1
        int j = n - 1;       // pointer for nums2
        int k = m + n - 1;   // pointer for merged array

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } 
            else {
                nums1[k--] = nums2[j--];
            }
        }

        // If any elements left in nums2, copy them
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

    }
}



// merging forward approach but takes extra space 
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Make a copy of the first m elements of nums1
        int[] nums1Copy = new int[m];
        for (int i = 0; i < m; i++) {
            nums1Copy[i] = nums1[i];
        }

        int p1 = 0;  // pointer for nums1Copy
        int p2 = 0;  // pointer for nums2
        int p = 0;   // pointer for writing into nums1

        // Merge nums1Copy and nums2 into nums1
        while (p1 < m && p2 < n) {
            if (nums1Copy[p1] <= nums2[p2]) {
                nums1[p++] = nums1Copy[p1++];
            } else {
                nums1[p++] = nums2[p2++];
            }
        }

        // If elements left in nums1Copy
        while (p1 < m) {
            nums1[p++] = nums1Copy[p1++];
        }

        // If elements left in nums2
        while (p2 < n) {
            nums1[p++] = nums2[p2++];
        }
    }
}

