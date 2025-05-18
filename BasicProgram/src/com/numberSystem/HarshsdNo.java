package com.numberSystem;

import java.util.Scanner;

public class HarshsdNo {

	public static boolean check(int num) {
		int sum = 0;
		int temp = num;

		while (temp > 0) {
			sum = sum + temp % 10;
			temp = temp / 10;
		}
		if (num % sum == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(check(num))
		{
			System.out.println("harshad number");
		}else {
			System.out.println("not");
		}
	}
}
