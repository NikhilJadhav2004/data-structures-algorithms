package DigitCount;

import java.util.Scanner;

public class NumDivision {

	public static boolean numIsDiv(int num) {
		
		int temp=num;
		int sum=0;
		
		while(temp!=0) {
			int digit=temp%10;
			sum+=digit;
			temp=temp/10;
		}
		return sum%9==0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(numIsDiv(num)) {
			System.out.println("yes");
		}else {
			System.out.println("NO");
		}
	}
}
