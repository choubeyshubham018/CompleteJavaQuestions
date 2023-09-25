package in.ineuron;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the target value you want to serach inside the array --> ");
		int target = sc.nextInt();
		int[] arr = { 1, 4, 6, 7, 9, 11, 13, 14, 17, 24 };
//		int ans = binarySearch(arr, target, 0, arr.length - 1);
//		System.out.println(ans);
		
		int res = itrBinarySearch(arr,target);
		System.out.println(res);
	}

	//Recursive Binary Search
	public static int binarySearch(int[] arr, int target, int i, int j) {
		if (i > j)
			return -1;
		int m = i + (j - i) / 2;
		if (arr[m] == target)
			return m;
		else if (arr[m] < target) {
			return binarySearch(arr, target, m + 1, j);
		} else {
			return binarySearch(arr, target, i, m - 1);
		}

	}
	
	//Iterative Binary Search
	public static int itrBinarySearch(int[]arr,int target) {
		int i=0,j=arr.length-1;
		while(i<=j) {
			int m=i+(j-i)/2;
			if(arr[m]==target) {
				return m;
			}
			else if(arr[m]>target) {
				j=m-1;
			}
			else {
				i=m+1;
			}
		}
		return -1;
		
	}

}
