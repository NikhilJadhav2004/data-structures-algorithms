package com.Problems;

public class LastOcuuranceOfElement {

	public static int Ocurrance(int arr[],int x) {
		
		int lastIndex=-1;
		
		for(int i=0;i<arr.length;i++) {
			if(x==arr[i]) {
				lastIndex=i;
			}
		}
		return lastIndex;
	}

   public static void main(String[] args) {
	   int arr[]= {5,6,5,3,5,4};
	   int x=5;
	   System.out.println(Ocurrance(arr, x));
   }
}

