package String;

public class Palendrome {

	public static boolean isPalendrome(String s) {
		
		int len=s.length();
		
		for(int i=0;i<=len/2;i++) {
			
			if(s.charAt(i)!=s.charAt(len-i-1)) {
				return false;
			}
		}
		
		return true;
		
	}
	public static void main(String[] args) {
		
		String str="aaaaaabbbaaaaaa";
		System.out.println(isPalendrome(str));
	}
}
