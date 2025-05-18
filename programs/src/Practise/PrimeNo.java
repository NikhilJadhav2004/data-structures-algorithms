package Practise;

public class PrimeNo {

	public static boolean prime(int a) {

		
		int n = a;
		int count = 0;

		if(n<=1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(a); i++) {

			if (a % i != 0) {
				count++;
			}

		}
		if (count == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		boolean a = prime(1);
		if (a == true) {
			System.out.println("prime");
		} else {
			System.out.println("no");
		}
	}
}
