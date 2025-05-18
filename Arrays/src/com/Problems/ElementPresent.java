package com.Problems;

public class ElementPresent {

	public static int ifPresent(int arr[],int x) {
		
		for(int i=0;i<arr.length;i++) {
			if(x==arr[i]) {
				return i;	
			}
			
		}
		return -1;
		
	}
	public static void main(String[] args) {
		
		int a[]= {3,4,5,6,7,8,8,9};
		int x=8;
		System.out.println(ifPresent(a, x));
	}
}
