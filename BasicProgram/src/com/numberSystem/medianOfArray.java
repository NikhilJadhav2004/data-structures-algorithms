package com.numberSystem;


import java.util.Arrays;
import java.util.Scanner;

public class medianOfArray {

	public static double output(int arr1[]) {
		Arrays.sort(arr1);
		int n=arr1.length;
		if(n%2==0) {
			return ((arr1[n/2])+(arr1[n/2-1]))/2;
		}
		return arr1[n/2];
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		double median=output(arr);
		System.out.println(median);
	}
}
