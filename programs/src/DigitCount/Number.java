package DigitCount;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		/*
		 * String s=Integer.toString(n);
		 * 
		 * System.out.println(s.length());
		 */
		
		int count=0;
		
		while(n!=0) {
		
			n=n/10;
			count++;
		
	}
		System.out.println(count);
}
}
