package DigitCount;

public class NumPalendrome {

	 public boolean isPalindrome(int n) {
	       
	       int temp=n;
	       int palendrome=0;
	       
	       while(temp!=0){
	           int digit=temp%10;
	           palendrome=(palendrome*10)+digit;
	           temp=temp/10;
	       }
	       return palendrome==n;
	    }
	 public static void main(String[] args) {
		
		 NumPalendrome n=new NumPalendrome();
		 if(n.isPalindrome(6767))
		 {	
			 System.out.println("yes");
		 }
		 else {
			System.out.println("no");
		}
		 
}
}
