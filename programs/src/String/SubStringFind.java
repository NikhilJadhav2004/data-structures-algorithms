package String;

public class SubStringFind {

	public static int StringFind(String s1,String s2) {
		
		int index=s1.indexOf(s2);
		
		if(index!= -1) {
			return index;
		}else {
			return -1;
		}
	}
	public static void main(String args[]) { 
		
		String a="hello, would";
		String b="would";
		System.out.println(StringFind(a, b));
	}
	
}
