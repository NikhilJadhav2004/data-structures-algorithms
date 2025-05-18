package String;

public class LastWordLength {

	public static int lenLastWord(String y) {
		
		int count=0;
		
		for(int i=0;i<y.length();i++) {
			
			if(y.charAt(i)!=' ') {
				count++;
			}else {
				count=0;
			}
		}
		return count;
		
	}
	
	
	
	public static void main(String[] args) {
		
		String s="hello would";
		
		System.out.println(lenLastWord(s));
	}
}
