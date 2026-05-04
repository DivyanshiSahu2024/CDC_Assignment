import java.util.*;
import java.io.*;

public class Main
{
	public static int countOper(int n, int [] nums) {
		int count=0;

		while(n>0) {
			int min=nums[0];
			for(int i=1; i<n; i++) {
				if(nums[i]<min) {
					min=nums[i];
				}
			}
			
			if(nums[0]==min) {
				for(int i=0; i<n-1; i++) {
					nums[i]=nums[i+1];
				}
				n--;
			}
			else {
				int first=nums[0];
				for(int i=0; i<n-1; i++) {
					nums[i]=nums[i+1];
				}
				nums[n-1]=first;
			}
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nums[]=new int[n];
		for(int i=0; i<n; i++) {
			nums[i]=sc.nextInt();
		}
		System.out.println(countOper(n,nums));
	}
}
