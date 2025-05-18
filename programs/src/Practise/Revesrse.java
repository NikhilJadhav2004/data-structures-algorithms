package Practise;

public class Revesrse {

	public static int reverseNo(int num) {
		int tem=num;
		int revrse=0;
		
		while (tem > 0) {
			int digit = tem % 10;

			revrse = revrse * 10 + digit;

			tem = tem / 10;

		}
		
		return revrse;
	}
	public static void main(String[] args) {
		
		int num=987654;
		
		System.out.println(reverseNo(num));
	}
}
