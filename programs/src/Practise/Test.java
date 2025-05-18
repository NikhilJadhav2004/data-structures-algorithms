package Practise;

import java.security.DomainCombiner;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//import javax.swing.text.html.parser.Entity;

public class Test {
	
	/*1>prime number
	 * public static boolean primeNo(int num) {
	 * 
	 * int count = 0; for (int i = 2; i <= Math.sqrt(num); i++) {
	 * 
	 * if (num % i == 0) { count++; } } if (count == 0) { return true; } return
	 * false; }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * System.out.println("Enter the number"); Scanner sc = new Scanner(System.in);
	 * int num = sc.nextInt();
	 * 
	 * System.out.println(primeNo(num)); if (primeNo(num)) {
	 * System.out.println("Prime number"); } else {
	 * System.out.println("Not Prime Number"); }
	 * 
	 * }
	 */
	/*2>fiboniues number
	 * public static void main(String[] args) {
	 * System.out.println("enter teh aumber"); Scanner sc=new Scanner(System.in);
	 * int n=sc.nextInt();
	 * 
	 * 
	 * int a=0; int b=1;
	 * 
	 * for(int i=1;i<=n;i++) {
	 * 
	 * System.out.println(a); int c=a+b; a=b; b=c; } }
	 */
	
	//#Tcs-3>Harshad Number
	
	/*
	 * public static boolean getResult(int n) { int sum=0; int temp=n;
	 * while(temp!=0) { int digit=temp%10; sum+=digit; temp=temp/10;
	 * System.out.println(temp); } if(n%sum==0) { return true; } return false;
	 * 
	 * }
	 * 
	 * 
	 * public static void main(String[] args) {
	 * 
	 * System.out.println("Enter the num"); Scanner sc = new Scanner(System.in); int
	 * num = sc.nextInt();
	 * 
	 * if(getResult(num)) { System.out.println("Harshad num"); }else {
	 * System.out.println("not Harshad"); } }
	 */
	//Tcs-4>Armstrong number
	
	/*
	 * public static boolean getResult(int n) {
	 * 
	 * int sum=0; int temp=n; int count=Integer.toString(n).length(); while(temp!=0)
	 * { int digit=temp%10; sum+=(int)Math.pow(digit, count); temp=temp/10; }
	 * if(sum==n) { return true; } return false; }
	 * 
	 * 
	 * 
	 * public static void main(String[] args) {
	 * 
	 * System.out.println("Enter the num"); Scanner sc=new Scanner(System.in); int
	 * num=sc.nextInt(); if(getResult(num)) { System.out.println("Armstrong num");
	 * }else { System.out.println("NOT"); } }
	 */
	 //5>Tcs chek the number is palendrome
	
		/*
		 * public static boolean getResult(int num) {
		 * 
		 * int temp=num; int sum=0;
		 * 
		 * while(temp!=0) { int Digit=temp%10; sum=sum*10+Digit; temp=temp/10; }
		 * System.out.println(num); System.out.println(sum); return num==sum; } public
		 * static void main(String[] args) { System.out.println("Enter the num");
		 * Scanner sc=new Scanner(System.in); int n=sc.nextInt();
		 * 
		 * if(getResult(n)) { System.out.println("palendrome"); }else {
		 * System.out.println("no"); } }
		 */
	//6>revrse the number
	
	/*
	 * public static void main(String[] args) {
	 * System.out.println("Enter the number"); Scanner sc = new Scanner(System.in);
	 * int num = sc.nextInt(); int sum=0; while(num!=0) { int y=num%10;
	 * System.out.println(y); sum=sum*10+y; num=num/10; } System.out.println(sum); }
	 */
	//7>pattern
	/*
	 * public static void main(String[] args) {
	 * 
	 * System.out.println("num of rows"); Scanner sc=new Scanner(System.in); int
	 * row=sc.nextInt();
	 */
		//1>*
		//  * *
		//  * * *
		/*
		 * for(int i =1;i<=row;i++) { for(int j=1;j<=i;j++) { System.out.print("*"); }
		 * System.out.println(); }
		 */
		
		//2>***
		//  **
		//  *
		
		/*
		 * for (int i = row; i >= 1; i--) { for (int j = 1; j<=i; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */
		//3
		//
		  //           *
				//    **
				//   ***
				//  ****
		/*		
		int sp=-row-1;
		int str=1;
		
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<sp;j++) {
				System.out.print("\t");
			}
			for(int k=0;k<str;k++) {
				System.out.print("*\t");
			}
			sp--;
			str++;
			System.out.println();
		}
		
	}*/
	
//         public static int rev(int num) {
//        	 
//        	 int temp=num;
//        	 int rev=0;
//        	 while(temp>0) {
//        		 
//        		 int digit=temp%10;
//        		 temp=temp/10;
//        		 rev=digit+(rev*10);
//        	 }
//        	return rev; 
//         }
//         public static void main(String[] args) {
//			System.out.println(rev(123));
//		}
	
//	public static int diff(int n,int m) {
//		
//		int divnosum=0;
//		int notdivsum=0;
//		
//		for(int i=1;i<=m;i++) {
//			
//			if(i%n==0) {
//				divnosum=divnosum+i;
//			}else {
//				notdivsum=notdivsum+i;
//			}
//		}
// 
//		return notdivsum-divnosum;
//		
//	}
//	public static void main(String[] args) {
//		System.out.println(diff(4, 20));
//	}
	
//	public static void fb(int n) {
//		int a=0;
//		int b=1;
//		
//		while(n>0) {
//			System.out.println(a);
//			int c=a+b;
//			a=b;
//			b=c;
//			n--;
//		}
//	}
//	public static void main(String[] args) {
//		fb(5);
//	}
	
//	public static int maxsum(int arr[]) {
//		
//		int sum=0;
//		int max=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			
//			sum=sum+arr[i];
//			max=Math.max(max,sum);
//			if(sum<0) {
//				sum=0;
//			}
//		}
//		return max;
//	}
//	public static void main(String[] args) {
//		
//		int a[]= {-2,1,-3,4,-1,2,1,-5,4};
//		System.out.println(maxsum(a));
//	}
	
//	public static boolean palendrome(int num) {
//		int temp=num;
//		int rev=0;
//		
//		while(temp>0) {
//			int digit=temp%10;
//			temp=temp/10;
//			rev=digit+(rev*10);
//		}
//		return num==rev;	
//		
//		
//	}
//	public static void main(String[] args) {
//		int a=121;
//		System.out.println(palendrome(a));
//		
//	}
	
//	public static int sum(int n,int m) {
//		
//		int sum=0;
//		
//		for(int i=n;i<=m;i++) {
//			if(i%3==0 && i%5==0) {
//				sum=sum+i;
//				
//			}
//		}
//		return sum;
//	}
//	public static void main(String[] args) {
//		
//		int n=12;
//		int m=50;
//		System.out.println(sum(n, m));
//	}
	
//	public static int max(int arr[]) {
//		
//		int max=arr[0];
//		
//		for(int i=1;i<arr.length;i++) {
//			
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
//		return max;
//	}
//	public static void main(String[] args) {
//		int arr[]= {3,5,7,2,8};
//		System.out.println(max(arr));
//	}
//	
//	public static int missing(int arr[]) {
//		
//		int len=arr.length;
//		
//		int n=arr[len-1];
//		int totalsum=n*(n+1)/2;
//		
//		int sum=0;
//		
//		for(int i=0;i<len;i++) {
//			sum+=arr[i];
//		}
//		
//		return totalsum-sum;
//		
//	}
//	public static void main(String[] args) {
//		
//		int a[]= {1,2,4,5,6};
//		System.out.println(missing(a));
//	}
	
	
	public static Set remove(int [] a) {
		
		Set<Integer> set=new LinkedHashSet<Integer>();
				
		
		for(int i=0;i<a.length;i++) {
			
			set.add(a[i]);
		}
		return set;
	}
	public static void main(String args[]) {
		int a[]= {1,2,2,3,4,4,5};
		System.out.println(remove(a));
	}
}
