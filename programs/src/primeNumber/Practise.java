package primeNumber;

import java.util.Scanner;

public class Practise {

	public static boolean isPrime(int num) {

		int count=0;
		
		if(num<=1) {
			return false;
		}
		
		for(int i=2;i<Math.sqrt(num);i++) {
			
			if(num%i==0) {
				count++;
			}
		}
		if(count==0) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {

		System.out.println(isPrime(1));
	}
}
