//Problem Link: https://www.naukri.com/code360/problems/build-heap_975375?leftPanelTabValue=PROBLEM

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> buildHeap(ArrayList<Integer> arr, int n) {
       
       
       for (int i = n/2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        return arr;

    }
     // Heapify function
    public static void heapify(ArrayList<Integer> arr, int n, int i) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < n && arr.get(left) > arr.get(largest)) {
            largest = left;
        }

        if (right < n && arr.get(right) > arr.get(largest)) {
            largest = right;
        }

        if (largest != i) {
            // Swap
            int temp = arr.get(i);
            arr.set(i, arr.get(largest));
            arr.set(largest, temp);

             // Recursively heapify
            heapify(arr, n, largest);
        }
    }
}
