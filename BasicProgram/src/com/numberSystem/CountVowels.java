package com.numberSystem;

public class CountVowels {

public static void main(String[] args) {
	
	String s="testing";
	int count=0;
	String s1=s.toUpperCase();
	System.out.println(s1);
	
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
			count++;
		}
	}
	System.out.println("count:"+count);
	
}
}
