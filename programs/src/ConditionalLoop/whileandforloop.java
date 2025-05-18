package ConditionalLoop;

import java.util.Scanner;

public class whileandforloop {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		while(a <11) {
			System.out.println(a);
			a++;
		}
		System.out.println(" while loop Done");
		
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("for loop");
		
	}
}
