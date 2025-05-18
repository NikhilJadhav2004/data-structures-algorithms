package Pattern;

import java.util.Scanner;

public class Pattern1 {

	
	
//	*
//	* *
//	* * *
//	* * * *
	
//	public static void main(String[] args) {
//		
//		System.out.println("enter the number of row");
//		Scanner sc=new Scanner(System.in);
//		int row=sc.nextInt();
//		
//		for(int i=1;i<=row;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	
//	public static void main(String[] args) {
		
		//pattern-2
//		* * *
//		* *
//		*
//		System.out.println("enter the number of row");
//		Scanner sc=new Scanner(System.in);
//      	int row=sc.nextInt();
//      	for(int i=row;i>0;i--) {
//      		for(int j=1;j<=i;j++) {
//      			System.out.print("*");
//      		}
//      		System.out.println();
//      	}
//      	
//	}
	
	//pattern-3
	//         *
	//       * *
	//    *  * *
	
//	public static void main(String[] args) {
//		
//		System.out.println("enter the number of row");
//		
//		Scanner sc=new Scanner(System.in);
//		int row=sc.nextInt();
//		
//		int sp=row-1;
//		int str=1;
//		for(int i=1;i<=row;i++) {
//			
//			for(int j=1;j<=sp;j++ ) {
//				
//				System.out.print("\t");
//				
//			}
//			for(int k=1;k<=str;k++) {
//				System.out.print("*\t");
//			}
//			System.out.println();
//			sp--;
//			str++;
//			
//		}
//	}
	
	public static void main(String[] args) {
		
		System.out.println("enter the number of row");
		
	Scanner sc=new Scanner(System.in);
	int row=sc.nextInt();
	
	int str=row;
	int sp=0;
	for(int i=0;i<row;i++) {
		
		for(int j=1;j<=sp;j++) {
			System.out.print("\t");
		}
		for(int k=0;k<str;k++) {
			System.out.print("*\t");
		}
		sp++;
		str--;
		System.out.println();
	}
	}
}
