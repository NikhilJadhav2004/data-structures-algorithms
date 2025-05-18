package Recursion;

public class FibonasisNo {

	public static int fb(int n) {
		
		if(n<=1) {
			return n;
		}
		return fb(n-1)+fb(n-2);
	}
	public static void main(String[] args) {
		System.out.println(fb(5));
	}
}
