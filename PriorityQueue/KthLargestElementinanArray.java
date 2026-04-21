package PriorityQueue;
import java.util.*;
public class KthLargestElementinanArray {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
             if(pq.size()>k){
            pq.poll();
         }
        }
       return pq.peek();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of K: ");
        int k=sc.nextInt();
        int ans=findKthLargest(arr,  k);
        System.out.println("Answer: "+ans);
        sc.close();

    }
}
// Problem Link: https://leetcode.com/problems/kth-largest-element-in-an-array/
//Simplest approch: 
// public class 215_KthLargestElementinanArray {
//     public int findKthLargest(int[] nums, int k) {
//         Arrays.sort(nums);
//         return nums[nums.length - k];
//     }
// }
