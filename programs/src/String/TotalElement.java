package String;

public abstract class TotalElement {

	
	public static int count(String s) {
		
		String name=s.trim();
		int count=0;
		for(int i=0;i<name.length();i++) {
			
			if(name.charAt(i)!=' ') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		System.out.println(count("Accenture coding round"));
	}
}
