package primeNumber;

import java.util.Scanner;
//print the n prime number
public class Test2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the startring number");
		int a=sc.nextInt();
		System.out.println("enter rhe last number");
		int b=sc.nextInt();
		 
		for(int i=a;i<=b;i++) {
			int count = 0;
			for (int div = 2; div <= Math.sqrt(i); div++) {
				if (i % div == 0) {
					count++;
					break;
				} else {

				}
			}

			if (count == 0) {
				System.out.println(i);
			}
		}
			
	}

}
