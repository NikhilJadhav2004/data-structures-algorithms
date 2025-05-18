package com.numberSystem;

import java.util.Scanner;

public class PrimeNo {

	public static boolean checkPrime(int num) {

		if(num<0) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {

			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numr = sc.nextInt();

		if (checkPrime(numr)) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}

}
