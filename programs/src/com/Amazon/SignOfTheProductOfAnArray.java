package com.Amazon;

public class SignOfTheProductOfAnArray {

	public static void main(String[] args) {
		
		int a[]= {-1,-2,-3,-4,3,2,1};
		int product=1;
		
		for(int i=0;i<a.length;i++) {
			product=product*a[i];
		}
		System.out.println(signFunction(product));
	}
	
	public static int signFunction(int product) {
		
		if(product>0) {
			return 1;
		}else if(product==0) {
			return 0;
		}
		return -1;
	}
	
}
