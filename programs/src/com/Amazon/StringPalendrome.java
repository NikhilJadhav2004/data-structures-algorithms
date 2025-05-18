package com.Amazon;

public class StringPalendrome {

	public static void main(String[] args) {
		
		String s="ababbaba";
		String ab="A man,a plan,a canal:panama";
		System.out.println(ispalendrome(s));
		System.out.println(UsingAlphanumericCheck(s));
		
	}
	public static boolean ispalendrome(String s) {
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
				return false;
			}
			}
		
            return true;
	}
	
	public static boolean UsingAlphanumericCheck(String a) {
		
		int start=0;
		int last=a.length()-1;
		
		while(start<=last) {
			
			if(!Character.isLetterOrDigit(a.charAt(start))) {
				
				start++;
			}else if(!Character.isLetterOrDigit(a.charAt(last)))
			{
				last--;
			}else if(Character.isLowerCase(a.charAt(start))!= Character.isLowerCase(a.charAt(last))){
				
				return false;
			}else {
				start++;
				last--;
				
			}
					{
				
			}
		}
		return true;
	}
	
}
