package Recursion;

public class NaturalNumSum {


public static int getSum(int a ) {
	if(a==0) {
		return 0;
	}
	return a+getSum(a-1);
}
public static void main(String[] args) {
	
	int n=3;
	int sum=getSum(n);
	System.out.println(sum);
}	
}
