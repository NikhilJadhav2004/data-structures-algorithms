package primeNumber;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);	
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		int count=0;
		for(int div=2;div<=Math.sqrt(n);div++) {
			if(n%div==0) {
				count++;
				break;
			}
		}
		
		if(count==0) {
			System.out.println("prime");
			System.out.println(count);
		}else {
			System.out.println(count);
			System.out.println("not prime");
		}
	}
}
