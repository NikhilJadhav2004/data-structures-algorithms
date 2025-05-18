package ArmstrongNumber;

import java.util.Scanner;

public class Test {
	
static int count=0;

public static boolean Armstrongnum(int n) {
	int orignalnum=n;
	int temp=n;
	int sum=0;
	while(temp!=0) {
		temp=temp/10;
		count++;
	}
	while(n!=0) {
		int Digit=n%10;
		sum=sum+(int)Math.pow(Digit, count);
		n=n/10;
	}
	
	if(sum!=orignalnum) {
		return false;
	}
	return true;
	
}
public static void main(String[] args) {
	
	
	System.out.println("Enter the num");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	
	    
	    if(Armstrongnum(n)) {
	    	System.out.println("number is armstrong");
	    }else {
			System.out.println("number is no armstrong number");
		}
	
	
}


}
