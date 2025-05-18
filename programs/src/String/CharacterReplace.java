package String;

public class CharacterReplace {

	public static String isReplace(String s1, char ch1,char ch2) {
		
		char arr[]=s1.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==ch1) {
				arr[i]=ch2;
			}else if(arr[i]==ch2) {
				arr[i]=ch1;
			}
		}
		
		return new String(arr);
	}
	
	public static void main(String[] args) {
		
		String s="apple";
		char c1='a';
		char c2='p';
        System.out.println(isReplace(s, c1, c2));		
		
	}
	
}
