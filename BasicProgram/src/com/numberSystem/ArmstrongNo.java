package com.numberSystem;

import java.util.Scanner;

public class ArmstrongNo {

	// logic
	// int convert into string
	// math.power
	// temp%10
	// temp/10
	public static boolean chek(int num) {

		int sum = 0;
		int temp = num;
		int digits = Integer.toString(num).length();
		while (temp > 0) {
			int digit = temp % 10;
			sum += Math.pow(digit, digits);
			temp = temp / 10;
		}
          System.out.println("-----");
		if (sum == num) {
			return true;

		}
		return false;
	}

	public static void main(String[] args) {

		System.out.println("enter the no");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		if (chek(number)) {
			System.out.println("armstrong number");
		} else {
			System.out.println("not");
		}

	}
}
