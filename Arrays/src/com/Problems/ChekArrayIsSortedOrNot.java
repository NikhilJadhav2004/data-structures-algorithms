package com.Problems;

public class ChekArrayIsSortedOrNot {

	public static void isSorted(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[i+1]) {
				System.out.println("not");
			}
		}
		System.out.println("yes");
	}
	public static void main(String[] args) {
		
		int[] a= {3,2,1,4,5,6};
		isSorted(a);
	}
	
	
}
