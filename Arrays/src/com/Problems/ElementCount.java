package com.Problems;

public class ElementCount {

	public static int elemenyCount(int arr[],int x) {
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			
			if(x==arr[i]) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		int arr[]= {5,6,5,1,5};
		System.out.println(elemenyCount(arr, 5));
	}
}
