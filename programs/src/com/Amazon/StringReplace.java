package com.Amazon;

public class StringReplace {

	public static void main(String[] args) {
		
		String address="1.1.1.1";
		System.out.println(isReplace(address));
		
	}
	public static String isReplace(String a) {
		
		StringBuffer str=new StringBuffer();
		
		for(int i=0;i<a.length();i++) {
			
			if(a.charAt(i) =='.'){	
				str.append("[.]");
			
			}else {
				str.append(a.charAt(i));
			}
			}
		return str.toString();
			
	}
	
	
}
