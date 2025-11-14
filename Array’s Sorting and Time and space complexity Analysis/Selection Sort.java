import java.io.*;
import java.util.*;

public class Solution{
  // Selection Sort Function
  public static void selectionsort(int arr[]){
    int n=arr.length;
    for(int i=0;i<n;i++){
      int minIdx=i;
      for(int j=i+1;j<n;j++){
        if(arr[j]<arr[minIdx]){
          minIdx=j;
        }
      }
      int temp=arr[i];
      arr[i]=arr[minIdx];
      arr[minIdx]=temp;
    }
  }

  // Main Function
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    //Calling the selection sort function
    selectionSort(arr); 
    //PRINTING THE SORTED ARRAY
    System.out.println("SORTED ARRAY: ");
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
