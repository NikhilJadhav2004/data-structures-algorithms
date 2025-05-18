package Practise;

import java.util.Scanner;

public class Palendrome {

	public static boolean isPalendrome(int temp) {
		
		int n=temp;
		int rev=0;
		
		while(n>0) {
			int digit=n%10;
			rev=digit+(rev*10);
			n=n/10;
		}
		return temp==rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		System.out.println(isPalendrome(num));
		
	}
}
