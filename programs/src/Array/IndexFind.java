package Array;

import java.util.Scanner;

public class IndexFind {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int find=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==find) {
				System.out.println(arr[i]+"Index is"+i);
				break;
			}
		}
	}
}
