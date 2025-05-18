package DigitCount;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		
		System.out.println("enter the number");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int temp=n;
		while(temp!=0) {
			int a=temp%10;
			System.out.println(a);
			temp=temp/10;
		}
	}
}
