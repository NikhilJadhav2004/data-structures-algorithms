package String;

public class ReverseString {

	public static String rev(String s) {
		int len=s.length();
		int j=0;
		char arr[]=new char[len];
		for(int i=len-1;i>=0;i--) {
			char s1=s.charAt(i);
			arr[j]=s1;
			j++;
		}
		
		return new String(arr);
	}
	public static void main(String[] args) {
		
		String s="heloo";
		System.out.println(rev(s));
	}
}
