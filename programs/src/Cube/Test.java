package Cube;

import java.util.Scanner;
public class Test {

	public static int ciubeOfNum(int Start ,int End) {
		
		int sum=0;
		
		for(int i=Start;i<=End;i++) {
			
			sum+=i*i*i;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int e=sc.nextInt();
		
		System.out.println(ciubeOfNum(s, e));
	}
}
