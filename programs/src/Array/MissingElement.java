package Array;

public class MissingElement {

	public static int miss(int start,int n,int arr[] ) {
	 int arrsum=0;
	 for(int i=start;i<arr.length;i++) {
		 arrsum=arrsum+arr[i];
		
	 }
	int sum=n*(n+1)/2;
	
	System.out.println(sum);
	System.out.println(arrsum);
	return sum-arrsum;
	}
	
	
	public static void main(String[] args) {
		int arr[]= {3,0,1};
		int start=0;
		int end=3;
		System.out.println(miss(start, end, arr));
	}
}
