package String;

import java.util.*;
import java.lang.*;

public class MoveElement {

	public static String movehash(String s) {

		String s1 = new String("");
		String s2 = new String("");

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '#') {
				s1 = s1 + s.charAt(i);
			} else {
				s2 = s2 + s.charAt(i);
			}

		}

		return s1 + s2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(movehash(s));
	}

}
