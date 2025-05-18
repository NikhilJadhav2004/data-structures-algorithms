package Array;

public class SecondLargestElement {

	 public static int getSecondLargest(int[] arr) {
	        // Code Here
	       
	       int large=arr[0];
	       int slarge=-1;
	       for(int i=1;i<arr.length;i++){
	           if(arr[i]>large){
	               slarge=large;
	               large=arr[i];
	           }else if(arr[i]<large && arr[i]>slarge){
	               slarge=arr[i];
	           }
	       }
	       return slarge;
	       
	}
	 public static int getSecondSmallest(int []arr) {
		 
		 int small=arr[0];
		 int ssmall=100;
		 
		 for(int i=1;i<arr.length;i++) {
			 if(arr[i]<small) {
				 ssmall=small;
				 small=arr[i];
			 }else if(arr[i]!=ssmall && arr[i]<ssmall){
				 ssmall=arr[i];
			 }
		 }
		 return ssmall;
		 
	 }
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		System.out.println(getSecondLargest(arr));
		System.out.println(getSecondSmallest(arr));
	}
	
}
