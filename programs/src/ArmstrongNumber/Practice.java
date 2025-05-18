package ArmstrongNumber;

import java.util.Scanner;

public class Practice {

	
	public static boolean Armstrongnumber(int num) {

		int sum = 0;

		int temp = num;
		

		int temp2 = num;

		int count = 0;
		while (temp2 != 0) {
			temp2 = temp2 / 10;
			count++;
		}

		while (temp != 0) {

			int digit = temp % 10;

			sum=sum+(int) Math.pow(digit, count);

			temp = temp / 10;

		}
		return sum==num;

	}
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(Armstrongnumber(num)) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}
}
