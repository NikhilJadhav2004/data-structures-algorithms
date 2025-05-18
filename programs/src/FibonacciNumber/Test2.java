package FibonacciNumber;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int sum=0;
		int c=0;
		int p=0;
		int q=1;
		for(int i=1;i<=a;i++) {
			//System.out.println(p);
			 c=p+q;
			p=q;
			q=c;
			
			sum+=p;
			
			
		}
		System.out.println(sum);
	}
}
