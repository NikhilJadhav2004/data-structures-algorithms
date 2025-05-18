package com.Amazon;

public class MergeSortdArray {

	public static void mergeSort(int nums1 [],int nums2 [],int m,int n ) {
		int i=m-1;
		int j=n-1;
		int x=m+n-1;
		
		while(i>=0 && j>=0) {
			
			if(nums1[i]>nums2[j]) {
				nums1[x]=nums1[i];
				x--;i--;
			}else {
				nums1[x]=nums2[j];
				x--;j--;
			}
		}
		while(j>=0) {
			nums1[x]=nums2[j];
			x--;j--; 
		}
		
	}
	public static void main(String[] args) {
		
		int m=3;
		int n=3;
		
		int arr[]= {7,8,9,0,0,0};
		int arr2[]= {2,5,6};
		
		mergeSort(arr, arr2, m, n);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
