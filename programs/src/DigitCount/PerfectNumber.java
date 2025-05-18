package DigitCount;

import java.util.Scanner;

public class PerfectNumber {
	
	//ex=6-devisor is 1,2,3 sum==num then perfect
	
	public boolean isPerefct(int num) {
		
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		return sum==num;
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		PerfectNumber p=new PerfectNumber();
		if(p.isPerefct(num)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
