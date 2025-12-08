// Problem Link: https://www.geeksforgeeks.org/dsa/implement-lower-bound/

class Solution {
    public static int lowerBound(int[] arr, int target) {
        int n = arr.length;

        // lets compare target with each element in array
        for (int i = 0; i < n; ++i) {
      
            // if equal or larger value found then return its index
            if(arr[i] >= target) {
                return i;
            }
        }

        // if all elements are smaller then return length
        return n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
       int target=sc.nextInt();

        System.out.println(lowerBound(arr, target));
    }
}
