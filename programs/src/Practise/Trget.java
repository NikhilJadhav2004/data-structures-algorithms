package Practise;

public class Trget {
	
	public int sum(int n) {
		
		int a=n;
		if(n>0) {
		
		return n+sum(n-1);
		}

		return n+sum(n-1);
}
	public static void main(String[] args) {
		Trget t=new Trget();
		int a=t.sum(10);
	System.out.println(a);
	}
}