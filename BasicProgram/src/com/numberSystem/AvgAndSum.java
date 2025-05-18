package com.numberSystem;

import java.util.Scanner;

public class AvgAndSum {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("entre the size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		System.out.println("====sum===Avg=====");
		
		for(int i=0;i<n;i++) {
			
			sum=sum+arr[i];
		}
		System.out.println("sum="+sum);
		
		int avg=sum/n;
		
		System.out.println("avg="+avg);
	}

}
