package com.Problems;

public class MaximumElement {

	public static int MaxElement(int arr[]) {
		
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
		
		int a[]= {4,5,7,8,2,9,6,5};
		System.out.println(MaxElement(a));
	}
}
