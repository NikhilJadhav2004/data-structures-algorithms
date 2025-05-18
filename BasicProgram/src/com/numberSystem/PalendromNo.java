package com.numberSystem;

import java.util.Scanner;

public class PalendromNo {

	public static boolean chek(int num) {
		int temp=num;
		int reversenum=0;
		while(temp>0) {
			int d=temp%10;
			reversenum=reversenum*10+d;
			temp=temp/10;
		}
		if(reversenum==num) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(chek(num)) {
			System.out.println("palendrome");
		}else {
			System.out.println("no");
		}
	}
}
