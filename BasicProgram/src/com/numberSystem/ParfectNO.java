package com.numberSystem;

import java.util.Scanner;

public class ParfectNO {

	public static boolean parfect(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			} else if (n < 0) {
				return false;
			}
		}
		if (sum == n) {
			return true;
		} else {
			return false;
		}

	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (parfect(n)) {
			System.out.println("parfect no");
		} else {
			System.out.println("not");
		}

	}
}
