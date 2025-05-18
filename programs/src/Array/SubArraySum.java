package Array;

public class SubArraySum {

	public static int sum(int arr[],int target) {
	
		int i=0;
		int count=0;
		int n=arr.length;
		for(int j=i+1;j<n && i<n-1;j++) {
			//System.out.println(arr[i]+" "+arr[j]);
			if(arr[i]+arr[j]==target) {
				count++;
			}
			//System.out.println(i +" ==="+j);
			if(j == n-1 ) {
				i++;
				j = i;
			}
	   }
		
		//System.out.println(i);
		return count;
	}
	public static void main(String[] args) {
		
		int arr[]= {4,6,3,5,3,2};
		int a=7;
		System.out.println(sum(arr,a));
	}
}
