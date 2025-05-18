package com.Problems;

public class SumOFArray {

	
	public static int SumIs(int arr[]) {
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
		
	}
	public static void main(String[] args) {
		
		int a[]= {2,4,5,6};
		System.out.println(SumIs(a));
	}
}
