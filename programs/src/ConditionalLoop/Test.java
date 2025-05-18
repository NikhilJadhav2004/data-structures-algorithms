package ConditionalLoop;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the mark");
		int mark = sc.nextInt();

		if (mark >= 90) {
			System.out.println("excellent");
		} else if (mark >= 80) {
			System.out.println("good");
		} else if (mark >= 70) {
			System.out.println("avrg");

		} else {
			System.out.println("not good");
		}

	}
}
