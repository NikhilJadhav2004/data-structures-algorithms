package DigitCount;

import java.util.Scanner;

public class SeparateDigit {
  public static void main(String[] args) {
	System.out.println("enter the no");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	int count=0;
	
	int temp=n;
	
	while(temp!=0) {
		
		temp=temp/10;
		count++;
	}

	int div=(int)Math.pow(10, count-1);
	
	System.out.println(div);
	
	while(div!=0) {
		
		int y=n/div;
		System.out.println(y);
		n=n%div;
		div=div/10;	
	

  }	
	
}
}
