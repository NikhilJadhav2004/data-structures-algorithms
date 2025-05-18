package Array;

import java.util.Scanner;

public class SumOfElement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the element");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int j=0;j<arr.length;j++)
		{
			sum+=arr[j];
		}
		System.out.println(sum);
	}
}
