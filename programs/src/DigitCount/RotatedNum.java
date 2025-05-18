package DigitCount;

import java.util.Scanner;

//only for positive direction
public class RotatedNum {

	public static void main(String[] args) {
		System.out.println("enter num");
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		System.out.println("enter ratated position");
		
		int rotate=sc.nextInt();
		
		
		int count=Integer.toString(num).length();
		
		int div=(int)Math.pow(10, rotate);
		
		int mul=(int)Math.pow(10, count-rotate);
		
		int remender=num%div;
		
		int quas=num/div;
		
		int newnum=remender*mul;
		
		int roatatednum=newnum+quas;
		
		System.out.println(roatatednum);
	}
}
