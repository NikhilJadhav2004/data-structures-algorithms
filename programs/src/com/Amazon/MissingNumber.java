package com.Amazon;

public class MissingNumber {

	
	public static int missing(int arr[]) {
		
		int n=arr.length;
		
		int totalSum=(n*(n+1))/2;
		
		int sum=0;
		
		for(int i=0 ;i<arr.length;i++) {
			
			sum+=arr[i];
		}
		return totalSum-sum;
		
	}
	public static void main(String[] args) {
		
		int a[]= {3,0,1};
		System.out.println(missing(a));
	}
}
