package com.numberSystem;

import java.util.Scanner;

public class ParfectNODiv {
     
	public static boolean parfect(int num) {
		
		int sum=0;
		
		for(int i=1;i<=num/2;i++) {
			
			if(num%i==0) {
				sum=sum+i;
			}else if(num < 0){
				return false;
			}
			
			
		}
		System.out.println(sum);
		if(sum==num) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(parfect(num)) {
			System.out.println("parfect no");
		}else {
			System.out.println("not parfect no");
		}
	}
}
